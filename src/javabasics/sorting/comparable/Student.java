package javabasics.sorting.comparable;

public class Student implements Comparable<Student> {
    Integer id;
    String name;
    String course;

    public Student(Integer id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    // for sorting only with student name
    //    @Override
    //    public int compareTo(Student anotherStudent) {
    //        return this.name.compareTo(anotherStudent.name);
    //    }

    // for sorting only with student name and course
    // first sorting will be performed on name
    // and if there are same names for two students then sorting will be performed on course
    @Override
    public int compareTo(Student anotherStudent) {
        if(this.name.compareTo(anotherStudent.name) == 0) {
            return this.course.compareTo(anotherStudent.course);
        } else {
            return this.name.compareTo(anotherStudent.name);
        }
    }
}
