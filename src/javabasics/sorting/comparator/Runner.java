package javabasics.sorting.comparator;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "ishtaq", 23, 2000);
        Employee e2 = new Employee(2, "ishtaq", 21, 1000);
        Employee e3 = new Employee(3, "arif", 30, 3000);
        Employee e4 = new Employee(4, "pasha", 18, 1000);

        List<Employee> employeeList = Arrays.asList(e1, e2, e3, e4);

        Comparator<Employee> employeeAgeComparator = new EmployeeAgeComparator();
        Collections.sort(employeeList, employeeAgeComparator);
        System.out.println(employeeList);

        Comparator<Employee> employeeNameComparator = new EmployeeNameComparator();
        Collections.sort(employeeList, employeeNameComparator);
        System.out.println(employeeList);

    }
}
