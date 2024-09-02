package DESIGN.TicTacToe.model;

import lombok.Getter;
import org.springframework.data.util.Pair;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Board {
    private int size;
    private PlayingPiece[][] board;

    public Board(int size) {
        this.size= size;
        board = new PlayingPiece[size][size];
    }

    // adding pieces
    public boolean addPiece(int row, int col, PlayingPiece playingPiece){
        if(board[row][col] != null){
            return false;
        }
        board[row][col] = playingPiece;
        return true;
    }

    // getting free cells
    public List<Pair<Integer, Integer>> getFreeCells(){
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    Pair<Integer, Integer> rowColumn = Pair.of(i, j);
                    freeCells.add(rowColumn);
                }
            }
        }
        return freeCells;
    }

    // printing board
    public void printBoard(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getPieceType().name() + "   ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }


    }
}
