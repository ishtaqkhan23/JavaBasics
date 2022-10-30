package javabasics.sorting.comparable;

import java.util.Set;
import java.util.TreeSet;

public class Department implements Comparable<Department> {
    Integer id;
    String depName;
    String depRole;

    public Department(Integer id, String depName, String depRole) {
        this.id = id;
        this.depName = depName;
        this.depRole = depRole;
    }

    @Override
    public int compareTo(Department anotherDept) {
        //return this.depName.compareTo(anotherDept.depName); //for ascending order
        return anotherDept.depName.compareTo(this.depName); //for descending order
    }


    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", depName='" + depName + '\'' +
                ", depRole='" + depRole + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Department d1 = new Department(1, "forest", "abc");
        Department d2 = new Department(2, "revenue", "abc");
        Department d3 = new Department(3, "police", "abcd");
        Department d4 = new Department(4, "revenue", "abcde");

        Set<Department> departmentSet = new TreeSet<>();
        departmentSet.add(d1);
        departmentSet.add(d2);
        departmentSet.add(d3);
        departmentSet.add(d4);

        System.out.println(departmentSet);
    }


}
