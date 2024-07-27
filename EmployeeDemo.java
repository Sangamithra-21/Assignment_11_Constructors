package Assignment_11_Constructors;

import java.util.ArrayList;
class Employee {
    int empId;
    String empName;
    static int id=1;
    String role;
    double salary;

    Employee(String empName,String role,double salary)
    {
        this.empId=id;
        id++;
        this.empName=empName;
        this.role=role;
        this.salary=salary;
    }
    void displayEmployee()
    {
        System.out.println("Employee Id     : "+empId);
        System.out.println("Employee Name   : "+empName);
        System.out.println("Employee ROle   : "+role);
        System.out.println("Employee Salary : "+salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee("Bharathi", "Developer", 30000);
        Employee e2 = new Employee("Dhivya", "Tester", 25000);
        employeeList.add(e1);
        employeeList.add(e2);
        for(Employee emp : employeeList)
        {
           emp.displayEmployee();
        }
    }


}
