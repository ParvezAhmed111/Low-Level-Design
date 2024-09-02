package designPatterns.creationalDesignPatterns.c_abstractFactoryMethodDP;

public class EmployeeFactory {
    //get Emloyee
    public static Employee getEmployee(EmployeeAbstractFactory factory){
        return factory.createEmployee();
    }
}
