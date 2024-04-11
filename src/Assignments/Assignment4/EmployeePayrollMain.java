package Assignments.Assignment4;

public class EmployeePayrollMain {
    public static void main(String[] args) {
        EmployeePayroll ep= new EmployeePayroll(101, "Shikha", 20000, "DBA");
        System.out.println("***************");
        ep.grossSalary();
        ep.deductions();;
        ep.netSalary();

    }
}
