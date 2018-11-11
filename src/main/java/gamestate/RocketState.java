package gamestate;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RocketState {

    private int rocketID;

    private double rocketX;

    private double rocketY;

    private String owner;

    @JsonCreator
    public RocketState(@JsonProperty int rocketID,
                       @JsonProperty double rocketX,
                       @JsonProperty double rocketY,
                       @JsonProperty String owner) {
        this.rocketID = rocketID;
        this.rocketX = rocketX;
        this.rocketY = rocketY;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "RocketState{" +
                "rocketID=" + rocketID +
                ", rocketX=" + rocketX +
                ", rocketY=" + rocketY +
                ", owner='" + owner + '\'' +
                '}';
    }
}
