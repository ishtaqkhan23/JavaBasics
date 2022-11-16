package javabasics.sorting.comparator;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getEmpAge() < o2.getEmpAge()){
            return -1;
        }else if(o1.getEmpAge() > o2.getEmpAge()) {
            return 1;
        } else {
            return 0;
        }
    }
}
