package designPatterns.behaviouralDesignPattern.a_strategyPattern.withStrategyPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy");
    }
}
