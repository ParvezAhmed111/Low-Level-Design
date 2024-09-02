package designPatterns.structuralDesignPatterns.e_bridgeDP.Solution.Abstraction;

import designPatterns.structuralDesignPatterns.e_bridgeDP.Solution.Implementor.BreatheImplementor;

public class Tree extends LivingThings {
    public Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        System.out.println("Tree breathing process");
        breatheImplementor.breatheProcess();
    }


}
