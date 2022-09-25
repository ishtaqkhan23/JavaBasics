package javabasics.staticnonstatic;

public class Employee {

    String employeeName;//non-static variable

    static String companyName = "CTS";//static variable

    void empLaptop() {// this is a non-static method
        System.out.println("Employee laptop...");
        calculateAnnualSalary(12000); //we can call static method directly from non-static
        empID();// we can call non-static method from non-static method
    }

    void empID() {// this is a non-static method
        System.out.println("Employee id...");
    }

    static void calculateAnnualSalary(int monthlySal) {//static method
        System.out.println(monthlySal * 12);
        //empLaptop();
        // we cannot call non-static method directly from static method. we get compile time error
        // "Non-static method 'empLaptop()' cannot be referenced from a static context"
        // to call, we need to create an object

        Employee employee = new Employee();
        employee.empLaptop();// with the object, we can call non-static methods
    }

    public static void main(String[] args) {
        System.out.println(Employee.companyName);

        //System.out.println(Employee.employeeName);

        calculateAnnualSalary(12000);


        Employee employee = new Employee();
        employee.employeeName = "Nawaz";
        System.out.println(employee.employeeName);
        System.out.println(employee.companyName);
        employee.empLaptop();
        employee.empID();

        Employee employee1 = new Employee();
        employee1.employeeName = "Ishtaq";
        System.out.println(employee1.employeeName);
        System.out.println(employee1.companyName);
        employee.empLaptop();
        employee.empID();


    }
}
