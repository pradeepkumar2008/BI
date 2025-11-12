import java.util.*;

public class ExamResults {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> data = new HashMap<>();

        data.put("Math", new HashMap<>());
        data.get("Math").put("Alice", 95);
        data.get("Math").put("Bob", 82);
        data.get("Math").put("Charlie", 88);

        data.put("Science", new HashMap<>());
        data.get("Science").put("Alice", 89);
        data.get("Science").put("Bob", 91);
        data.get("Science").put("Charlie", 84);

        data.put("English", new HashMap<>());
        data.get("English").put("Alice", 78);
        data.get("English").put("Bob", 88);
        data.get("English").put("Charlie", 92);

        for (String subject : data.keySet()) {
            Map<String, Integer> scores = data.get(subject);
            String topper = "";
            int max = 0;
            int sum = 0;
            boolean above90 = false;

            for (Map.Entry<String, Integer> e : scores.entrySet()) {
                int marks = e.getValue();
                sum += marks;
                if (marks > max) {
                    max = marks;
                    topper = e.getKey();
                }
                if (marks > 90) above90 = true;
            }

            double avg = (double) sum / scores.size();
            System.out.println("Subject: " + subject);
            System.out.println("Topper: " + topper + " (" + max + ")");
            System.out.println("Average: " + avg);
            if (above90) System.out.println("At least one scored above 90");
            System.out.println();
        }
    }
}
