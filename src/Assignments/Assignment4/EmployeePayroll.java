// Create an EmployeePayroll class with properties like employeeId, employeeName, basicSalary, and designation.
// Write a constructor to initialize these properties when instantiating an EmployeePayroll object.
// Implement methods to calculate the gross salary, deductions, and net salary.

package Assignments.Assignment4;

public class EmployeePayroll {
    int employeeId;
    String employeeName;
            int basicSalary;
            String designation;

    public EmployeePayroll(int employeeId, String employeeName, int basicSalary, String designation) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.designation = designation;
        System.out.println("ID of employee  " +employeeId);
        System.out.println("Name of employee: " +employeeName);
        System.out.println("Basic salary of employee" +basicSalary);
        System.out.println("Designation of employee :" +designation);
    }
    public void grossSalary(){
        System.out.println("Gross Salary: The amount of money which is paid before taxes and any other deductions");
    }
    public void deductions(){
        System.out.println("Deduction: An amount that is or may be deducted from something");
    }
    public void netSalary(){
        System.out.println("Net salary: The amount employees receive into their bank account every month after deductions.");
    }
}

