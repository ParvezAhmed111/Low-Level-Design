package designPatterns.creationalDesignPatterns.c_abstractFactoryMethodDP;

public class WebDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Getting salary of web developer");
        return 40000;
    }

    @Override
    public String name() {
        System.out.println("I am an web developer");
        return "WEB DEVELOPER";

    }
}
