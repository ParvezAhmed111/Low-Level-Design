package DESIGN.WordProcessor.solution;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DocumentCharacter implements ILetter{
    private char character;
    private String fontType;
    private int size;

    @Override
    public void display(int row, int col) {

    }
}
