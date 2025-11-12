import java.util.*;

class Question {
    int id;
    String text;

    public Question(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public String toString() {
        return "Question " + id + ": " + text;
    }
}

class Student {
    String studentId;
    String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String toString() {
        return "Student[ID=" + studentId + ", Name=" + name + "]";
    }
}

public class OnlineExamSystem {
    public static void main(String[] args) {
        Set<String> studentIDs = new HashSet<>();
        Queue<Student> examQueue = new LinkedList<>();
        List<Question> questionList = new ArrayList<>();
        Stack<Question> questionStack = new Stack<>();
        String[] ids = {"S101", "S102", "S101", "S103"};
        for (String id : ids) {
            if (studentIDs.add(id)) {
                examQueue.add(new Student(id, "Student_" + id));
            }
        }

        System.out.println("Enrolled Students (Unique):");
        studentIDs.forEach(System.out::println);

        // Add and randomize questions
        questionList.add(new Question(1, "What is Java?"));
        questionList.add(new Question(2, "Explain OOP."));
        questionList.add(new Question(3, "What is polymorphism?"));
        Collections.shuffle(questionList);

        System.out.println("\nRandomized Questions:");
        questionList.forEach(System.out::println);
        System.out.println("\nServing Students:");
        while (!examQueue.isEmpty()) {
            Student s = examQueue.poll();
            System.out.println("Serving " + s);
        }

        System.out.println("\nNavigating Questions:");
        for (Question q : questionList) {
            questionStack.push(q);
            System.out.println("Viewing: " + q);
        }
        while (!questionStack.isEmpty()) {
            System.out.println("Going Back: " + questionStack.pop());
        }
    }
}
