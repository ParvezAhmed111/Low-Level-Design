package designPatterns.creationalDesignPatterns.c_abstractFactoryMethodDP;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Getting salary of android developer");
        return 50000;
    }

    @Override
    public String name() {
        System.out.println("I am an android developer");
        return "ANDROID DEVELOPER";
    }
}
