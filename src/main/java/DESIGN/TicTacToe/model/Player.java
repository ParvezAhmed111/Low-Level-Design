package DESIGN.TicTacToe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Player {
    private String name;
    private PlayingPiece playingPiece;
}
