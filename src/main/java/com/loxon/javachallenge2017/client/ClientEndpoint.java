package com.loxon.javachallenge2017.client;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import gamedescription.GameDescription;
import gamestate.GameState;
import messages.MessageProcessor;
import messages.TextMessage;

import javax.websocket.Endpoint;
import javax.websocket.EndpointConfig;
import javax.websocket.MessageHandler;
import javax.websocket.Session;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class ClientEndpoint extends Endpoint implements MessageHandler.Whole<String>, WebsocketSender {

    private CountDownLatch messageLatch;

    private ObjectMapper mapper = new ObjectMapper();

    private Session session;

    private MessageProcessor messageProcessor;

    public ClientEndpoint(CountDownLatch messageLatch) {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.messageLatch = messageLatch;
        messageProcessor = new MessageProcessor(this );
    }

    @Override
    public void onOpen(Session session, EndpointConfig endpointConfig) {
        System.out.println("Connected to endpoint: " + session.getBasicRemote());
        session.addMessageHandler(this);
        this.session = session;
        messageProcessor.processConnected();
    }

    @Override
    public void onMessage(String message) {
//        System.out.println("Received message in client: " + message);
        try {
            if (message.contains("\"text\"")) {
                TextMessage textMessage = mapper.readValue(message, TextMessage.class);
                messageProcessor.processTextMessage(textMessage);
            } else if (message.contains("mapSizeY")) {
                messageProcessor.processGameDescription(mapper.readValue(message, GameDescription.class));
            } else if (message.contains("timeElapsed")) {
                messageProcessor.processGameState(mapper.readValue(message, GameState.class));
            } else {
                System.out.println("Unknown message:" + message);
            }
        } catch (IOException ioe) {
            System.err.println("Error processing message");
            ioe.printStackTrace();
        }
    }

    @Override
    public void onError(Session session, Throwable t) {
        System.err.println("Something has happened");
        t.printStackTrace();
    }

    @Override
    public void sendObject(Object o) {
        try {
            String json = mapper.writeValueAsString(o);
            System.out.println("Sending message to endpoint: " + json);
            session.getAsyncRemote().sendText(json);
        } catch (IOException ex) {
            System.err.println("Error sending message to endpoint");
            ex.printStackTrace();
        }
    }

    public void stop() {
        messageLatch.countDown();
    }
}
