package designPatterns.structuralDesignPatterns.g_flyweightDP.Game.solution;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
    public static Map<String, IRobot> roboticObjectCache = new HashMap<>();

    public static IRobot createRobot(String robotType){
        if(roboticObjectCache.containsKey(robotType)){
            return roboticObjectCache.get(robotType);
        }
        else {
            if(robotType.equals("HUMANOID")){
                Sprites humanoidSprite = new Sprites();
                HumanoidRobot humanoidRobotObj= new HumanoidRobot(robotType, humanoidSprite);
                roboticObjectCache.put(robotType, humanoidRobotObj);
                return humanoidRobotObj;
            }
            else if (robotType.equals("ROBOTIC_DOG")){
                Sprites roboticDogSprite= new Sprites();
                RoboticDog roboticDogObj = new RoboticDog(robotType, roboticDogSprite);
                roboticObjectCache.put(robotType, roboticDogObj);
                return roboticDogObj;
            }
        }
        return null;
    }
}
