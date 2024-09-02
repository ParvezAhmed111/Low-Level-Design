package designPatterns.structuralDesignPatterns.a_decoratorDP;

public class Mushoom extends PizzaDecorator{

    Pizza pizza;

    public Mushoom(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " get mushroom";
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 18;
    }
}
