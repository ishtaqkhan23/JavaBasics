package javabasics.constructor;

public class Student {

    String name;
    int age;

    //this is a default constructor provided by java
    public Student() {

    }

    //this is a parameterized constructor. it is used to set the values to the object at the time of object creation
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {

        //using default constructor
        Student juniorStudent = new Student();
        juniorStudent.name = "Nawaz";
        juniorStudent.age = 25;
        System.out.println(juniorStudent.name);
        System.out.println(juniorStudent.age);


        //using parameterized constructor
        Student seniorStudent = new Student("Ishtaq", 30);
        System.out.println(seniorStudent.name);
        System.out.println(seniorStudent.age);

    }
}
