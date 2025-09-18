public class Employee {

    static String companyName = "ABC Company";
    static int totalEmployees = 0;

    String name;
    final int id;
    String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void showTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void showInfo() {
        if (this instanceof Employee) {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 1, "Manager");
        e1.showInfo();
        showTotalEmployees();
    }
}
