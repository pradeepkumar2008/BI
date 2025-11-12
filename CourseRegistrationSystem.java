import java.util.*;

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        Map<String, Integer> courses = new HashMap<>();

        courses.put("CS101", 45);
        courses.put("MA102", 52);
        courses.put("PH103", 3);
        courses.put("EN104", 10);
        courses.put("HS105", 0);

        addStudent(courses, "CS101");
        addStudent(courses, "PH103");
        dropStudent(courses, "HS105");
        dropStudent(courses, "PH103");

        System.out.println("Courses Near Full (≥ 50 students):");
        for (Map.Entry<String, Integer> e : courses.entrySet()) {
            if (e.getValue() >= 50)
                System.out.println(e.getKey() + " - " + e.getValue() + " students");
        }

        System.out.println("\nUnder-Subscribed Courses (< 5 students):");
        for (Map.Entry<String, Integer> e : courses.entrySet()) {
            if (e.getValue() < 5)
                System.out.println(e.getKey() + " - " + e.getValue() + " students");
        }
    }

    static void addStudent(Map<String, Integer> map, String course) {
        map.put(course, map.getOrDefault(course, 0) + 1);
    }

    static void dropStudent(Map<String, Integer> map, String course) {
        int count = map.getOrDefault(course, 0);
        if (count > 0)
            map.put(course, count - 1);
    }
}
