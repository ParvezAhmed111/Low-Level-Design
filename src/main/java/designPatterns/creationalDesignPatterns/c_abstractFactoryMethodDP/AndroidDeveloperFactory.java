package designPatterns.creationalDesignPatterns.c_abstractFactoryMethodDP;

public class AndroidDeveloperFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
