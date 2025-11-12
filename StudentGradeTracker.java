import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();

        grades.put("Alice", 85.5);
        grades.put("Bob", 78.0);
        grades.put("Charlie", 92.0);
        grades.put("David", 66.5);
        grades.put("Eve", 88.0);

        grades.put("Bob", 82.5);

        grades.remove("David");

        System.out.println("Student Grades (Alphabetical Order):");
        List<String> names = new ArrayList<>(grades.keySet());
        Collections.sort(names);
        for (String name : names) {
            System.out.println(name + " - " + grades.get(name));
        }
    }
}
