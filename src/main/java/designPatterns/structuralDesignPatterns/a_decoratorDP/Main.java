package designPatterns.structuralDesignPatterns.a_decoratorDP;

public class Main {
    public static void main(String[] args) {
        Pizza pizza= new FarmHouse();
        System.out.println(pizza.getDescription() + " : " + pizza.cost());

        pizza = new ExtraCheese(pizza);
        System.out.println(pizza.getDescription() + " : " + pizza.cost());

        pizza = new Mushoom(pizza);
        System.out.println(pizza.getDescription() + " : " + pizza.cost());
    }
}
