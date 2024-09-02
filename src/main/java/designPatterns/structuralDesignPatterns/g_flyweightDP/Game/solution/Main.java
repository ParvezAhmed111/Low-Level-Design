package designPatterns.structuralDesignPatterns.g_flyweightDP.Game.solution;

public class Main {
    public static void main(String[] args) {
        IRobot humanoidRobot1 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot1.display(1, 2);

        IRobot humanoidRobot2 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot2.display(10, 30);

        IRobot roboticDog1 = RoboticFactory.createRobot("ROBOTIC_DOG");
        roboticDog1.display(2, 9);

        IRobot roboticDog2 = RoboticFactory.createRobot("ROBOTIC_DOG");
        roboticDog2.display(11, 19);
    }
}
