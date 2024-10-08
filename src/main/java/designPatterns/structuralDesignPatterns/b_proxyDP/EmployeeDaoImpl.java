package designPatterns.structuralDesignPatterns.b_proxyDP;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, Employee obj) throws Exception {
        System.out.println("Created new row in the Employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deleted row with employee Id: " + employeeId);
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        System.out.println("Fetching data from the DB");
        return new Employee();
    }
}
