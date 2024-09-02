package designPatterns.structuralDesignPatterns.a_decoratorDP;

public class ExtraCheese extends PizzaDecorator{
    private Pizza pizza;

    public ExtraCheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with extra cheese";
    }

    @Override
    public int cost() {
        return this.pizza.cost()+10;
    }
}
