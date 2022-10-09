package javabasics.wrapperclasses;

public class Employee {
    String employeeName;

    //primitive
    int age;

    //non-premitive
    //Wrapper class
    Integer employeeAge;

    //primitive
    boolean hasBankAccount;

    //primitive
    //Wrapper class
    Boolean empHasBankAccount;

    public static void main(String[] args) {
        Employee employee = new Employee();

        System.out.println(employee.age);
        System.out.println(employee.employeeAge);

        System.out.println(employee.hasBankAccount);
        System.out.println(employee.empHasBankAccount);

    }
}
