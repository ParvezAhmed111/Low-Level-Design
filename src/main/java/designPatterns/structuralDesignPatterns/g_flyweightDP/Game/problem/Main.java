package designPatterns.structuralDesignPatterns.g_flyweightDP.Game.problem;

public class Main {
    public static void main(String[] args) {
        int x= 0;
        int y= 0;

        // creating 5 lakh humanoid robot
        for (int i=0; i<500000; i++){
            Sprites humanoidSprite= new Sprites();
            Robot humanoidRobotObject = new Robot(x+i, y+i, "HUMANOID", humanoidSprite);
        }

        // creating 5 lakh robotic dogs
        for (int i=0; i<500000; i++){
            Sprites roboticDogSprite= new Sprites();
            Robot roboticDogObject = new Robot(x+i, y+i, "ROBOTIC_DOGS", roboticDogSprite);
        }
    }
}
