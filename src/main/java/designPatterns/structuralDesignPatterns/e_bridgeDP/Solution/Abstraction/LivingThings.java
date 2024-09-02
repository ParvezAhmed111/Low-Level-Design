package designPatterns.structuralDesignPatterns.e_bridgeDP.Solution.Abstraction;

import designPatterns.structuralDesignPatterns.e_bridgeDP.Solution.Implementor.BreatheImplementor;

public abstract class LivingThings{

    BreatheImplementor breatheImplementor;

    public LivingThings(BreatheImplementor breatheImplementor){
        this.breatheImplementor= breatheImplementor;
    }

    public abstract void breatheProcess();
}
