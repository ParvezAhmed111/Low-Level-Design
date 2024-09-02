package designPatterns.structuralDesignPatterns.a_decoratorDP;

public class VegDelight extends Pizza {
    @Override
    public String getDescription() {
        return "VegDelight Pizza";
    }

    @Override
    public int cost() {
        return 120;
    }
}
