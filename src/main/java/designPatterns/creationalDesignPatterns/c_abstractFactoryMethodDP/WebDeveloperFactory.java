package designPatterns.creationalDesignPatterns.c_abstractFactoryMethodDP;

public class WebDeveloperFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
