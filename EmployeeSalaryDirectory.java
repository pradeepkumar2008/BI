import java.util.*;

public class EmployeeSalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> salaries = new HashMap<>();

        salaries.put("Alice", 55000.0);
        salaries.put("Bob", 62000.0);
        salaries.put("Charlie", 58000.0);
        salaries.put("David", 70000.0);
        salaries.put("Eve", 75000.0);
        salaries.put("Frank", 50000.0);

        giveRaise(salaries, "Alice", 10);
        giveRaise(salaries, "Eve", 5);
        giveRaise(salaries, "George", 12);

        double total = 0;
        for (double s : salaries.values()) total += s;
        double avg = total / salaries.size();
        System.out.println("Average Salary: ₹" + avg);

        double max = Collections.max(salaries.values());
        System.out.println("Highest Salary: ₹" + max);
        System.out.println("Highest-paid Employee(s):");
        for (Map.Entry<String, Double> e : salaries.entrySet()) {
            if (e.getValue() == max) System.out.println(e.getKey());
        }
    }

    static void giveRaise(Map<String, Double> map, String name, double percent) {
        if (map.containsKey(name)) {
            double newSalary = map.get(name) * (1 + percent / 100);
            map.put(name, newSalary);
            System.out.println(name + " got a " + percent + "% raise. New salary: ₹" + newSalary);
        } else {
            System.out.println("Employee not found: " + name);
        }
    }
}
