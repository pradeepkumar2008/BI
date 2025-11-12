import java.util.*;

public class EmployeeDepartment {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "HR");
        employees.put(102, "IT");
        employees.put(103, "Finance");
        employees.put(104, "IT");
        employees.put(105, "HR");

        employees.put(103, "IT");

        String deptToFind = "IT";
        System.out.println("Employees in " + deptToFind + ":");
        for (Map.Entry<Integer, String> e : employees.entrySet()) {
            if (e.getValue().equals(deptToFind)) {
                System.out.println(e.getKey());
            }
        }

        HashMap<String, Integer> deptCount = new HashMap<>();
        for (String dept : employees.values()) {
            deptCount.put(dept, deptCount.getOrDefault(dept, 0) + 1);
        }

        System.out.println("\nTotal employees per department:");
        for (Map.Entry<String, Integer> e : deptCount.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}
