package DESIGN.WordProcessor.problem;

public class Main {
    /*
    Flyweight design pattern -> structural DP
        This is the data we want to write into the word processor

        Total = 59 characters
        t = 7 times
        h = 3 times
        a = 3 times and so on ...
    */

    Character object1 = new Character('T', "Arial", 10, 0, 0);
    Character object2 = new Character('h', "Arial", 10, 0, 1);
    Character object3 = new Character('i', "Arial", 10, 0, 2);
    Character object4 = new Character('s', "Arial", 10, 0, 3);
}
