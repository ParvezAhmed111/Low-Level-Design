package designPatterns.structuralDesignPatterns.e_bridgeDP.Solution;

import designPatterns.structuralDesignPatterns.e_bridgeDP.Solution.Abstraction.Fish;
import designPatterns.structuralDesignPatterns.e_bridgeDP.Solution.Abstraction.LivingThings;
import designPatterns.structuralDesignPatterns.e_bridgeDP.Solution.Implementor.WaterBreathe;

public class Main {
    public static void main(String[] args) {
        LivingThings fish = new Fish(new WaterBreathe());
        fish.breatheProcess();
    }
}
