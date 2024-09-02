// Flyweight Class

package designPatterns.structuralDesignPatterns.g_flyweightDP.Game.solution;

public class RoboticDog implements IRobot {
    private String type;
    private Sprites body; // small 2d bitmap (graphic element)

    public RoboticDog(String type, Sprites body){
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }

    @Override
    public void display(int x, int y) {
        //use the humanoid sprites object and X and Y coordinates to render the image

    }
}
