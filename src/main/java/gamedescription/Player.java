package gamedescription;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Player {

    private int userID;

    private String userName;

    private int raceID;

    @JsonCreator
    public Player(@JsonProperty int userID,
                  @JsonProperty String userName,
                  @JsonProperty int raceID) {
        this.userID = userID;
        this.userName = userName;
        this.raceID = raceID;
    }

    @Override
    public String toString() {
        return "Player{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", raceID=" + raceID +
                '}';
    }
}
