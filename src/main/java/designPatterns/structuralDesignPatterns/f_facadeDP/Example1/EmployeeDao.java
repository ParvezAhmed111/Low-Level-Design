package designPatterns.structuralDesignPatterns.f_facadeDP.Example1;

public class EmployeeDao {
    public void insert(){
        // insert into Employee Table
        System.out.println("Employee inserted");
    }

    public void updateEmployeeName(){
        // updating employeeName
        System.out.println("Employee updated");
    }

    public Employee getEmployeeDetails(String emailId){
        // get employee details based on email ID
        System.out.println("Getting employee details based on email ID");
        return new Employee();
    }

    public Employee getEmployeeDetails(int empId){
        // get employee details based on Emp ID
        System.out.println("Getting employee details based on Emp ID");
        return new Employee();
    }
}
