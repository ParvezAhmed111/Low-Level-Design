package designPatterns.structuralDesignPatterns.a_decoratorDP;

public class FarmHouse extends Pizza {
    @Override
    public String getDescription() {
        return "FarmHouse Pizza";
    }

    @Override
    public int cost() {
        return 200;
    }
}
