package designPatterns.creationalDesignPatterns.b_factoryMethodDP;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting salary of web developer");
        return 40000;
    }
}
