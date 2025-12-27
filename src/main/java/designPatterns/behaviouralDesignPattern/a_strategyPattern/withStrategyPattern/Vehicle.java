package designPatterns.behaviouralDesignPattern.a_strategyPattern.withStrategyPattern;

import designPatterns.behaviouralDesignPattern.a_strategyPattern.withStrategyPattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy= driveStrategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
