package gamestate;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Standing {

    private String userID;

    private int score;

    @JsonCreator
    public Standing(@JsonProperty String userID, @JsonProperty int score) {
        this.userID = userID;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Standing{" +
                "userID='" + userID + '\'' +
                ", score=" + score +
                '}';
    }
}
