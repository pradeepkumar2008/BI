import java.util.*;

class Student {
    String name;
    int marks;
    public Student(String name, int marks) { this.name = name; this.marks = marks; }
    public String toString() { return name + " (" + marks + ")"; }
}

public class CollegeAdmission {
    public static void main(String[] args) {
        List<Student> applicants = new ArrayList<>();
        Set<Student> shortlisted = new HashSet<>();
        Queue<Student> interviewQueue = new LinkedList<>();
        TreeSet<Student> meritList = new TreeSet<>((a, b) -> b.marks - a.marks);

        applicants.add(new Student("Akshat", 85));
        applicants.add(new Student("Riya", 92));
        applicants.add(new Student("Arjun", 76));

        System.out.println("All Applicants:");
        applicants.forEach(System.out::println);

        for (Student s : applicants) {
            if (s.marks >= 80) shortlisted.add(s);
        }

        System.out.println("\nShortlisted Students:");
        shortlisted.forEach(System.out::println);

        interviewQueue.addAll(shortlisted);

        System.out.println("\nInterviewing Students:");
        while (!interviewQueue.isEmpty()) {
            Student s = interviewQueue.poll();
            System.out.println("Interview done: " + s);
            meritList.add(s);
        }

        System.out.println("\nFinal Merit List:");
        meritList.forEach(System.out::println);
    }
}

