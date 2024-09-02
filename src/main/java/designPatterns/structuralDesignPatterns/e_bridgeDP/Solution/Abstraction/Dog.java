package designPatterns.structuralDesignPatterns.e_bridgeDP.Solution.Abstraction;


import designPatterns.structuralDesignPatterns.e_bridgeDP.Solution.Implementor.BreatheImplementor;

public class Dog extends LivingThings {

    public Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        System.out.println("Dog breathing process");
        breatheImplementor.breatheProcess();
    }
}
