package designPatterns.structuralDesignPatterns.d_adapterDP.Adapter;

import designPatterns.structuralDesignPatterns.d_adapterDP.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }
    @Override
    public double getWeightInKgs() {
        double weightInPounds = weightMachine.getWeightInPounds();

        //convert into kgs
        double weightInKgs = weightInPounds + 45;
        return weightInKgs;
    }
}
