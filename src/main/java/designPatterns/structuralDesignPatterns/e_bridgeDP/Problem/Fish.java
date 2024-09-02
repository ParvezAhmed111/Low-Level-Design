package designPatterns.structuralDesignPatterns.e_bridgeDP.Problem;

public class Fish extends LivingThings{
    @Override
    void breatheProcess() {
        // breathe through gills
        // absorb oxygen
        // release CO2
        System.out.println("Fish breathing process");
    }
}
