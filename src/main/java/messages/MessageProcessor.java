package messages;


import com.loxon.javachallenge2017.client.WebsocketSender;
import gamedescription.GameDescription;
import gamestate.GameState;

import java.util.Arrays;

public class MessageProcessor {
    private WebsocketSender websocketSender;

    //private OmnipotentGrandmaster omnipotentGrandmaster;

    public MessageProcessor(WebsocketSender websocketSender /*,OmnipotentGrandmaster omnipotentGrandmaster*/) {
        this.websocketSender = websocketSender;
        //this.omnipotentGrandmaster = omnipotentGrandmaster;
    }

    public void processConnected() {
//        websocketSender.sendObject(new TextMessage(102, 107, 5));
    }

    public void processTextMessage(TextMessage textMessage) {
        System.out.println("Ship next x coordinate : " + textMessage.getxCoordinate()
                + " Ship next y coordinate : " + textMessage.getyCoordinate()
                + " Shield will be activated? : " + textMessage.isShieldIsActivated()
                + " Rocket next x coordinate : " + textMessage.isShieldIsActivated()
                + " Rocket next y coordinate : " + textMessage.isShieldIsActivated()
                + " Ship will be upgraded? : " + textMessage.isUpgraded()
                );
        websocketSender.stop();
    }

    public void processGameDescription(GameDescription gameDescription) {
        System.out.println(gameDescription);
        //omnipotentGrandmaster.setGameDescription(gameDescription);
    }

    public void processGameState(GameState gameState) {
 /*       System.out.println("time : " + gameState.getTimeElapsed());
        System.out.println(Arrays.toString(gameState.getPlanetStates()));
        System.out.println("standings : " + Arrays.toString(gameState.getStandings()));*/
//        System.out.println("gameState : " + gameState.getGameState());
        //omnipotentGrandmaster.makeIngeniousMove(gameState);
    }
}
