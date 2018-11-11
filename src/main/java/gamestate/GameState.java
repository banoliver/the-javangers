package gamestate;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class GameState {

    private MeteoriteState[] meteoriteStates;

    private RocketState[] rocketStates;

    private ShipState[] shipStates;

    private Standing[] standings;

    private String gameStatus;

    private int timeElapsed;

    @JsonCreator
    public GameState(@JsonProperty MeteoriteState[] meteoriteStates,
                     @JsonProperty RocketState[] rocketStates,
                     @JsonProperty ShipState[] shipStates,
                     @JsonProperty Standing[] standings,
                     @JsonProperty String gameStatus,
                     @JsonProperty int timeElapsed) {
        this.meteoriteStates = meteoriteStates;
        this.rocketStates = rocketStates;
        this.shipStates = shipStates;
        this.standings = standings;
        this.gameStatus = gameStatus;
        this.timeElapsed = timeElapsed;
    }

    @Override
    public String toString() {
        return "GameState{" +
                "meteoriteStates=" + Arrays.toString(meteoriteStates) +
                ", rocketStates=" + Arrays.toString(rocketStates) +
                ", shipStates=" + Arrays.toString(shipStates) +
                ", standings=" + Arrays.toString(standings) +
                ", gameStatus='" + gameStatus + '\'' +
                ", timeElapsed=" + timeElapsed +
                '}';
    }
}
