package com.kh.inherit.practice;

public class Employee extends Person {
    private int salary;
    private String dept;

    public Employee() {

    }

    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String information() {
        return name + "/" + super.information() + "/" + salary + "/" + dept;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

}
