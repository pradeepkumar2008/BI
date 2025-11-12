import college.student.Student;
import college.faculty.Faculty;
public class MainClass {
    public static void main(String[] args) {
        Student s = new Student();
        Faculty f = new Faculty();
        s.displayStudent("Ravi", 101);
        f.displayFaculty("Dr. Mehta", "Physics");
    }
}