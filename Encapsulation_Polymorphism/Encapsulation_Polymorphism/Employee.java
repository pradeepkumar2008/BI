package Encapsulation_Polymorphism;
import java.util.*;
interface Department {
    void assignDepartment(String d);
    String getDepartmentDetails();
}
abstract class BaseEmployee {
    int id;
    String name, dept;
    double baseSalary;

    BaseEmployee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public abstract double calculateSalary();
    public void display() {
        System.out.println(id + " | " + name + " | " + dept + " | Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends BaseEmployee implements Department {
    double bonus;
    FullTimeEmployee(int id, String n, double s, double b) {
        super(id, n, s);
        bonus = b;
    }
    public double calculateSalary() {
        return baseSalary + bonus;
    }
    public void assignDepartment(String d) {
        dept = d;
    }
    public String getDepartmentDetails() {
        return dept;
    }
}
class PartTimeEmployee extends BaseEmployee implements Department {
    int hrs;
    double rate;
    PartTimeEmployee(int id, String n, double r, int h) {
        super(id, n, 0);
        rate = r;
        hrs = h;
    }
    public double calculateSalary() {
        return rate * hrs;
    }
    public void assignDepartment(String d) {
        dept = d;
    }
    public String getDepartmentDetails() {
        return dept;
    }
}

public class Employee {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BaseEmployee> emps = new ArrayList<>();
        System.out.print("Enter no. of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Type (1=FullTime, 2=PartTime): ");
            int t = sc.nextInt();
            sc.nextLine();
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            if (t == 1)
            {
                System.out.print("Base Salary: ");
                double s = sc.nextDouble();
                System.out.print("Bonus: ");
                double b = sc.nextDouble();
                sc.nextLine();

                FullTimeEmployee f = new FullTimeEmployee(id, name, s, b);
                System.out.print("Dept: ");
                f.assignDepartment(sc.nextLine());
                emps.add(f);
            }
            else
            {
                System.out.print("Hourly Rate: ");
                double r = sc.nextDouble();
                System.out.print("Hours: ");
                int h = sc.nextInt();
                sc.nextLine();
                PartTimeEmployee p = new PartTimeEmployee(id, name, r, h);
                System.out.print("Dept: ");
                p.assignDepartment(sc.nextLine());
                emps.add(p);
            }
        }
        System.out.println("\n--- Employee Details ---");
        for (BaseEmployee e : emps) e.display();
        sc.close();
    }
}