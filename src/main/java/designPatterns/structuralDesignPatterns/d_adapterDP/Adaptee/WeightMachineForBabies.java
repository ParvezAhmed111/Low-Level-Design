package designPatterns.structuralDesignPatterns.d_adapterDP.Adaptee;

public class WeightMachineForBabies implements WeightMachine {
    @Override
    public double getWeightInPounds() {
        return 28;
    }
}
