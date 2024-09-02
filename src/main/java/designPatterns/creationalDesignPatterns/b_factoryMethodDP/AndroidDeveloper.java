package designPatterns.creationalDesignPatterns.b_factoryMethodDP;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting salary of android developer");
        return 50000;
    }
}
