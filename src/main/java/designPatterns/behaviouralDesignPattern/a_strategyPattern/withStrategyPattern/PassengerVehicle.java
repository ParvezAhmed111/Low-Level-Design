package designPatterns.behaviouralDesignPattern.a_strategyPattern.withStrategyPattern;

import designPatterns.behaviouralDesignPattern.a_strategyPattern.withStrategyPattern.strategy.DriveStrategy;
import designPatterns.behaviouralDesignPattern.a_strategyPattern.withStrategyPattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
