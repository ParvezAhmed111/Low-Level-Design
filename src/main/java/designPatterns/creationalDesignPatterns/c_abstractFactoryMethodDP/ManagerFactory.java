package designPatterns.creationalDesignPatterns.c_abstractFactoryMethodDP;

public class ManagerFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {
        return new Manager();
    }
}
