package designPatterns.structuralDesignPatterns.f_facadeDP.Example1;

public class EmployeeClient {
    public static void main(String[] args) {
        EmployeeFacade employeeFacade= new EmployeeFacade();
        Employee employee= employeeFacade.getEmployeeDetails(1212);
    }
}
