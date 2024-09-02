package designPatterns.structuralDesignPatterns.d_adapterDP.Client;

import designPatterns.structuralDesignPatterns.d_adapterDP.Adaptee.WeightMachineForBabies;
import designPatterns.structuralDesignPatterns.d_adapterDP.Adapter.WeightMachineAdapter;
import designPatterns.structuralDesignPatterns.d_adapterDP.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter= new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKgs());
    }
}
