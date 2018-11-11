package gamedescription;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class GameDescription {

    private int gameLength;

    private int mapSizeY;

    private int mapSizeX;

    private int commandSchedule;

    private int internalSchedule;

    private int broadcastSchedule;

    private int minMovableArmySize;

    private double rocketMovementSpeed;

    private int rocketLoadingSchedule;

    private int rocketExplosionRadius;

    private int rocketRange;

    private double shipMovementSpeed;

    private int shipRedeploySchedule;

    private int shipSize;

    private int shieldUsingSchedule;

    private int shieldRenewingSchedule;

    private int upgradeScore;

    private double movementSpeedMultiplier;

    private Meteorite[] meteorites;

    private Player[] players;

    private Spaceship[] spaceships;

    @JsonCreator
    public GameDescription(@JsonProperty int gameLength,
                           @JsonProperty int mapSizeY,
                           @JsonProperty int mapSizeX,
                           @JsonProperty int commandSchedule,
                           @JsonProperty int internalSchedule,
                           @JsonProperty int broadcastSchedule,
                           @JsonProperty int minMovableArmySize,
                           @JsonProperty double rocketMovementSpeed,
                           @JsonProperty int rocketLoadingSchedule,
                           @JsonProperty int rocketExplosionRadius,
                           @JsonProperty int rocketRange,
                           @JsonProperty double shipMovementSpeed,
                           @JsonProperty int shipRedeploySchedule,
                           @JsonProperty int shipSize,
                           @JsonProperty int shieldUsingSchedule,
                           @JsonProperty int shieldRenewingSchedule,
                           @JsonProperty int upgradeScore,
                           @JsonProperty double movementSpeedMultiplier,
                           @JsonProperty Meteorite[] meteorites,
                           @JsonProperty Player[] players,
                           @JsonProperty Spaceship[] spaceships) {
        this.gameLength = gameLength;
        this.mapSizeY = mapSizeY;
        this.mapSizeX = mapSizeX;
        this.commandSchedule = commandSchedule;
        this.internalSchedule = internalSchedule;
        this.broadcastSchedule = broadcastSchedule;
        this.minMovableArmySize = minMovableArmySize;
        this.rocketMovementSpeed = rocketMovementSpeed;
        this.rocketLoadingSchedule = rocketLoadingSchedule;
        this.rocketExplosionRadius = rocketExplosionRadius;
        this.rocketRange = rocketRange;
        this.shipMovementSpeed = shipMovementSpeed;
        this.shipRedeploySchedule = shipRedeploySchedule;
        this.shipSize = shipSize;
        this.shieldUsingSchedule = shieldUsingSchedule;
        this.shieldRenewingSchedule = shieldRenewingSchedule;
        this.upgradeScore = upgradeScore;
        this.movementSpeedMultiplier = movementSpeedMultiplier;
        this.meteorites = meteorites;
        this.players = players;
        this.spaceships = spaceships;
    }

    @Override
    public String toString() {
        return "GameDescription{" +
                "gameLength=" + gameLength +
                ", mapSizeY=" + mapSizeY +
                ", mapSizeX=" + mapSizeX +
                ", commandSchedule=" + commandSchedule +
                ", internalSchedule=" + internalSchedule +
                ", broadcastSchedule=" + broadcastSchedule +
                ", minMovableArmySize=" + minMovableArmySize +
                ", rocketMovementSpeed=" + rocketMovementSpeed +
                ", rocketLoadingSchedule=" + rocketLoadingSchedule +
                ", rocketExplosionRadius=" + rocketExplosionRadius +
                ", rocketRange=" + rocketRange +
                ", shipMovementSpeed=" + shipMovementSpeed +
                ", shipRedeploySchedule=" + shipRedeploySchedule +
                ", shipSize=" + shipSize +
                ", shieldUsingSchedule=" + shieldUsingSchedule +
                ", shieldRenewingSchedule=" + shieldRenewingSchedule +
                ", upgradeScore=" + upgradeScore +
                ", movementSpeedMultiplier=" + movementSpeedMultiplier +
                ", meteorites=" + Arrays.toString(meteorites) +
                ", players=" + Arrays.toString(players) +
                ", spaceships=" + Arrays.toString(spaceships) +
                '}';
    }
}
