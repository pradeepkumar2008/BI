import java.util.*;

public class StudentAttendanceTracker {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new HashMap<>();

        attendance.put("Alice", 0);
        attendance.put("Bob", 0);
        attendance.put("Charlie", 0);
        attendance.put("David", 0);
        attendance.put("Eve", 0);

        Random rand = new Random();
        List<String> students = new ArrayList<>(attendance.keySet());

        for (int day = 1; day <= 15; day++) {
            Set<String> presentToday = new HashSet<>();
            for (String s : students) {
                if (rand.nextBoolean()) presentToday.add(s);
            }
            for (String s : presentToday) {
                attendance.put(s, attendance.get(s) + 1);
            }
        }

        System.out.println("Attendance Summary (out of 15 days):");
        for (Map.Entry<String, Integer> e : attendance.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        System.out.println("\nStudents present fewer than 10 days:");
        for (Map.Entry<String, Integer> e : attendance.entrySet()) {
            if (e.getValue() < 10)
                System.out.println(e.getKey() + " (" + e.getValue() + " days)");
        }
    }
}
