package com.company.hr;
public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.department = dept;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}