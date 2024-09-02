package designPatterns.structuralDesignPatterns.e_bridgeDP.Solution.Abstraction;


import designPatterns.structuralDesignPatterns.e_bridgeDP.Solution.Implementor.BreatheImplementor;

public class Fish extends LivingThings {
    public Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        System.out.println("Fish breathing process");
        breatheImplementor.breatheProcess();
    }
}
