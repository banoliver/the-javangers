package messages;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TextMessage {

    private double xCoordinate;

    private double yCoordinate;

    private boolean shieldIsActivated;

    private double rocketMoveToX;

    private double rocketMoveToY;

    private boolean isUpgraded;

    @JsonCreator
    public TextMessage(@JsonProperty("shipMoveToX") double xCoordinate,
                       @JsonProperty("shipMoveToY") double yCoordinate,
                       @JsonProperty("shieldIsActivated") boolean shieldIsActivated,
                       @JsonProperty("rocketMoveToX") double rocketMoveToX,
                       @JsonProperty("rocketMoveToY") double rocketMoveToY,
                       @JsonProperty("isUpgraded") boolean isUpgraded) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.shieldIsActivated = shieldIsActivated;
        this.rocketMoveToX = rocketMoveToX;
        this.rocketMoveToY = rocketMoveToY;
        this.isUpgraded = isUpgraded;
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public boolean isShieldIsActivated() {
        return shieldIsActivated;
    }

    public double getRocketMoveToX() {
        return rocketMoveToX;
    }

    public double getRocketMoveToY() {
        return rocketMoveToY;
    }

    public boolean isUpgraded() {
        return isUpgraded;
    }
}
