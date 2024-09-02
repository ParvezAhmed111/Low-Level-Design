package DESIGN.Snake_Ladder_Game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    String id;
    int currentPosition;

//    @AllArgsConstructor
    public Player(String id, int currentPosition) {
        this.id = id;
        this.currentPosition = currentPosition;
    }
}
