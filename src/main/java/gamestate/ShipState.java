package gamestate;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipState {

    private int shipID;

    private double shipX;

    private double shipY;

    private boolean shieldIsActivated;

    private boolean isUpgraded;

    private String owner;

    @JsonCreator
    public ShipState(@JsonProperty int shipID,
                     @JsonProperty double shipX,
                     @JsonProperty double shipY,
                     @JsonProperty boolean shieldIsActivated,
                     @JsonProperty boolean isUpgraded,
                     @JsonProperty String owner) {
        this.shipID = shipID;
        this.shipX = shipX;
        this.shipY = shipY;
        this.shieldIsActivated = shieldIsActivated;
        this.isUpgraded = isUpgraded;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "ShipState{" +
                "shipID=" + shipID +
                ", shipX=" + shipX +
                ", shipY=" + shipY +
                ", shieldIsActivated=" + shieldIsActivated +
                ", isUpgraded=" + isUpgraded +
                ", owner='" + owner + '\'' +
                '}';
    }
}
