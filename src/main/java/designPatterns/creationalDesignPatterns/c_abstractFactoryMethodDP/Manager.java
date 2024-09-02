package designPatterns.creationalDesignPatterns.c_abstractFactoryMethodDP;

public class Manager implements Employee {
    @Override
    public int salary() {
        System.out.println("Getting salary of manager");
        return 100000;
    }

    @Override
    public String name() {
        System.out.println("I am an manager");
        return "MANAGER";
    }
}
