package DESIGN.Game.problem;

public class Robot {
    int coordinateX; // 4 byte
    int coordinateY; // 4 byte
    String type;     // 50 byte
    Sprites body;    // small 2d bitmap (graphic eleent) --> 30 kb

    public Robot(int x, int y, String type, Sprites body){
        this.coordinateX = x;
        this.coordinateY = y;
        this.type = type;
        this.body = body;
    }
}
