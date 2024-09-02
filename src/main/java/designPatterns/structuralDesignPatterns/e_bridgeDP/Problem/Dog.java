package designPatterns.structuralDesignPatterns.e_bridgeDP.Problem;

public class Dog extends LivingThings{
    @Override
    void breatheProcess() {
        // breathe through nose
        // inhale oxygen
        // exhale CO2
        System.out.println("Dog breathing process");
    }
}
