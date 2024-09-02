package designPatterns.structuralDesignPatterns.e_bridgeDP.Solution.Implementor;

public class LandBreathe implements BreatheImplementor {

    @Override
    public void breatheProcess() {
        // breathe through nose
        // inhale oxygen
        // exhale CO2
        System.out.println("Land Breathe process");
    }
}
