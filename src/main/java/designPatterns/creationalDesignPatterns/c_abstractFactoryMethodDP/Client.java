package designPatterns.creationalDesignPatterns.c_abstractFactoryMethodDP;

public class Client {
    public static void main(String[] args) {
       //i want to get androidDeveloper
        Employee employee1 = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        employee1.name();

        Employee employee2 = EmployeeFactory.getEmployee(new WebDeveloperFactory());
        employee2.name();

        Employee employee3 = EmployeeFactory.getEmployee(new ManagerFactory());
        employee3.name();
    }
}
