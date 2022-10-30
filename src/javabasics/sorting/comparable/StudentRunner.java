package javabasics.sorting.comparable;

import java.util.*;

public class StudentRunner {

    public static void main(String[] args) {
        Student s1 = new Student(1, "ishtaq", "b.tech");
        Student s2 = new Student(2, "ishtaq", "aeronautical");
        Student s5 = new Student(5, "ishtaq", "ca");
        Student s3 = new Student(3, "arif", "b.com");
        Student s4 = new Student(4, "nawaz", "b.tech");

        List<Student> students = new LinkedList<>();
        students.add(s1);
        students.add(s5);
        students.add(s2);
        students.add(s3);
        students.add(s4);


        System.out.println(students);

        Collections.sort(students);

        System.out.println(students);
    }
}
