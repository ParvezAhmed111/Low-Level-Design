package designPatterns.behaviouralDesignPattern.a_strategyPattern.withStrategyPattern;

import designPatterns.behaviouralDesignPattern.a_strategyPattern.withStrategyPattern.strategy.DriveStrategy;
import designPatterns.behaviouralDesignPattern.a_strategyPattern.withStrategyPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
