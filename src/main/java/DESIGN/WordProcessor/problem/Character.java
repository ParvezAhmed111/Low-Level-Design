package DESIGN.WordProcessor.problem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Character {
    //intrinsic data
    private char character;
    private String fontType;
    private int size;

    //extrinsic data
    private int row;
    private int column;
}
