package Static.Variable;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1= new Employee();
        e1.setEmpId(2);
        e1.setEmpName("Lovepreet");
        e1.setCompanyName("Pragra");
       String a =  e1.getCompanyName();
        System.out.println(a);
        System.out.println(e1.getEmpName());
       // System.out.println("ID : " +e1.getEmpId() + "Name : " +e1.getEmpName() + "Company Name : " +e1.getCompanyName());
        System.out.println(e1);

        Employee e2= new Employee();

        Employee e3= new Employee();

        Employee e4= new Employee();

    }
}
