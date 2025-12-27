package designPatterns.behaviouralDesignPattern.a_strategyPattern.withStrategyPattern;

import designPatterns.behaviouralDesignPattern.a_strategyPattern.withStrategyPattern.strategy.DriveStrategy;
import designPatterns.behaviouralDesignPattern.a_strategyPattern.withStrategyPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
