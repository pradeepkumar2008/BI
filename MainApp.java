package college.main;
import college.student.Student;
import college.faculty.Faculty;
import college.department.Department;
import static java.lang.Math.*;
public class MainApp {
    public static void main(String[] args) {
        Student s = new Student();
        Faculty f = new Faculty();
        Department d = new Department();
        s.display();
        f.display();
        d.display();
        System.out.println("Static Import Example sqrt(25): " + sqrt(25));
    }
}