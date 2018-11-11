package gamedescription;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Spaceship {

    private int shipID;

    private double shipX;

    private double shipY;

    private boolean shieldIsActivated;

    private boolean isUpgraded;

    private String owner;

    @JsonCreator
    public Spaceship(@JsonProperty int shipID,
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
}
