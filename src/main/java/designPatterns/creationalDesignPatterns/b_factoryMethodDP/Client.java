package designPatterns.creationalDesignPatterns.b_factoryMethodDP;

public class Client {
    public static void main(String[] args) {
        Employee employee1= EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        int salary1= employee1.salary();
        System.out.println("Salary : " + salary1);

        Employee employee2= EmployeeFactory.getEmployee("WEB DEVELOPER");
        int salary2= employee2.salary();
        System.out.println("Salary : " + salary2);
    }
}
