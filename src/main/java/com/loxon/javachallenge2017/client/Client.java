package com.loxon.javachallenge2017.client;

import javax.websocket.ClientEndpointConfig;
import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.WebSocketContainer;
import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.net.URI;
import java.util.*;
import java.util.concurrent.CountDownLatch;

public class Client {
    public static final String AUTHORIZATION_CODE = "thejavan:BaYZb5IuuItng";

    public static final String WEBSOCKET_URI = "ws://javachallenge.loxon.hu:8080/JavaChallenge2018/websocket";

    public static void main(String[] args) {
        new Client().start();
    }

    public void start() {
        try {
            CountDownLatch messageLatch = new CountDownLatch(1);
            WebSocketContainer container = ContainerProvider.getWebSocketContainer();

            ClientEndpointConfig.Configurator configurator = new ClientEndpointConfig.Configurator() {
                @Override
                public void beforeRequest(Map<String, List<String>> headers) {
                    headers.put("Authorization", Arrays.asList(
                            "Basic " +
                                    DatatypeConverter.printBase64Binary(AUTHORIZATION_CODE.getBytes())
                    ));
                }
            };
            ClientEndpointConfig config = ClientEndpointConfig.Builder.create().configurator(configurator).build();

            System.out.println("Connecting to " + WEBSOCKET_URI);
            container.connectToServer(new ClientEndpoint(messageLatch), config, URI.create(WEBSOCKET_URI));
            messageLatch.await();
        } catch (DeploymentException | InterruptedException | IOException ex) {
            throw new IllegalStateException("Error running client", ex);
        }
    }
}
