package designPatterns.structuralDesignPatterns.b_proxyDP;

public class ProxyPattern {
    public static void main(String[] args) {
        try {
            EmployeeDao employeeDao= new EmployeeDaoProxy();
//            employeeDao.create("USER", new Employee());   //Access denied
            employeeDao.create("ADMIN", new Employee());  //Created new row in the Employee table
//            employeeDao.delete("ADMIN", 2);               //Deleted row with employee Id: 2
//            employeeDao.get("USER", 2);                   //Fetching data from the DB
//            employeeDao.get("ADMIN", 2);                  //Fetching data from the DB
            System.out.println("Operation Successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
