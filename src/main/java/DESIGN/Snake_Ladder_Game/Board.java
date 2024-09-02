package DESIGN.Snake_Ladder_Game;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    Board(int boardSize, int noOfSnakes, int noOfLadders){
        initializeCells(boardSize);
        addSnakesAndLadders(boardSize, noOfSnakes, noOfLadders);
    }

    public void initializeCells(int boardSize){
        cells = new Cell[boardSize][boardSize];
        for (int i=0; i<boardSize; i++){
            for (int j=0; j<boardSize; j++){
                cells[i][j]= new Cell();
            }
        }
    }

    public void addSnakesAndLadders(int boardSize, int noOfSnakes, int noOfLadders){
        while (noOfSnakes>0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1,boardSize*boardSize-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1,boardSize*boardSize-1);
            if (snakeTail >= snakeHead) continue;

            Jump snakeObj= new Jump();
            snakeObj.start= snakeHead;
            snakeObj.end= snakeTail;

            Cell cell= getCell(snakeHead);
            cell.jump= snakeObj;

            noOfSnakes--;
        }

        while (noOfLadders>0){
            int ladderHead = ThreadLocalRandom.current().nextInt(1,boardSize*boardSize-1);
            int ladderTail = ThreadLocalRandom.current().nextInt(1,boardSize*boardSize-1);
            if (ladderHead >= ladderTail) continue;

            Jump snakeObj= new Jump();
            snakeObj.start= ladderHead;
            snakeObj.end= ladderTail;

            Cell cell= getCell(ladderHead);
            cell.jump= snakeObj;

            noOfLadders--;
        }
    }

    Cell getCell(int playerPosition) {
        int boardRow = playerPosition / cells.length;
        int boardColumn = (playerPosition % cells.length);
        return cells[boardRow][boardColumn];
    }

}
