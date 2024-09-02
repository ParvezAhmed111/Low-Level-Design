package DESIGN.Snake_Ladder_Game;

import lombok.AllArgsConstructor;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;
    int min = 1;
    int max = 6;

    //constructor
    public Dice(int count){
        this.diceCount= count;
    }

    public int rollDice(){
        int totalSum=0;
        int diceUsed=0;

        while (diceUsed<diceCount){
            int diceNo= ThreadLocalRandom.current().nextInt(min, max+1); // dice can have nos only-> 1, 2, 3, 4, 5, 6
            totalSum += diceNo;
            diceUsed++;
        }
        return totalSum;
    }
}
