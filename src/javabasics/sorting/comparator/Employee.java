package javabasics.sorting.comparator;

public class Employee {
    Integer id;
    String empName;
    Integer empAge;
    Integer salary;

    public Employee(Integer id, String empName, Integer empAge, Integer salary) {
        this.id = id;
        this.empName = empName;
        this.empAge = empAge;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", salary=" + salary +
                '}';
    }
}
