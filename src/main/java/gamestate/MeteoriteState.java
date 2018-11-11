package gamestate;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MeteoriteState {

    private int meteoriteRadius;

    private int meteoriteID;

    private double meteoriteX;

    private double meteoriteY;

    @JsonCreator
    public MeteoriteState(@JsonProperty int meteoriteRadius,
                          @JsonProperty int meteoriteID,
                          @JsonProperty double meteoriteX,
                          @JsonProperty double meteoriteY) {
        this.meteoriteRadius = meteoriteRadius;
        this.meteoriteID = meteoriteID;
        this.meteoriteX = meteoriteX;
        this.meteoriteY = meteoriteY;
    }

    @Override
    public String toString() {
        return "MeteoriteState{" +
                "meteoriteRadius=" + meteoriteRadius +
                ", meteoriteID=" + meteoriteID +
                ", meteoriteX=" + meteoriteX +
                ", meteoriteY=" + meteoriteY +
                '}';
    }
}
