package designPatterns.structuralDesignPatterns.f_facadeDP.Example1;

public class EmployeeFacade {
    EmployeeDao employeeDao;

    public EmployeeFacade(){
        employeeDao= new EmployeeDao();
    }

    public void insert(){
        employeeDao.insert();
    }

    public Employee getEmployeeDetails(int empId){
        return employeeDao.getEmployeeDetails(empId);
    }
}
