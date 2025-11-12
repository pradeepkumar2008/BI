import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    private String name;
    private int credits;

    public CourseType(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name + " (" + credits + " credits)";
    }
}

class ExamCourse extends CourseType {
    public ExamCourse(String name, int credits) {
        super(name, credits);
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String name, int credits) {
        super(name, credits);
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String name, int credits) {
        super(name, credits);
    }
}

class Course<T extends CourseType> {
    private T courseType;
    private String professor;
    private List<String> students;

    public Course(T courseType, String professor) {
        this.courseType = courseType;
        this.professor = professor;
        this.students = new ArrayList<>();
    }

    public void addStudent(String student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return courseType + "\nProfessor: " + professor + "\nStudents: " + students;
    }
}

public class UniversityCourseManagement {
    public static void displayCourses(List<? extends CourseType> courses) {
        System.out.println("Courses:");
        for (CourseType course : courses) {
            System.out.println("- " + course);
        }
    }

    public static void main(String[] args) {
        Course<ExamCourse> mathCourse = new Course<>(
            new ExamCourse("Advanced Mathematics", 4), "Dr. Smith"
        );
        mathCourse.addStudent("John");
        mathCourse.addStudent("Alice");

        Course<AssignmentCourse> programmingCourse = new Course<>(
            new AssignmentCourse("Java Programming", 3), "Prof. Johnson"
        );
        programmingCourse.addStudent("Bob");
        programmingCourse.addStudent("Carol");

        Course<ResearchCourse> thesisCourse = new Course<>(
            new ResearchCourse("Research Methods", 6), "Dr. Wilson"
        );
        thesisCourse.addStudent("David");

        System.out.println("Math Course:");
        System.out.println(mathCourse);
        System.out.println("\nProgramming Course:");
        System.out.println(programmingCourse);
        System.out.println("\nThesis Course:");
        System.out.println(thesisCourse);
    }
}