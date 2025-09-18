public class Student {

    static String universityName = "XYZ University";
    static int totalStudents = 0;

    String name;
    final int rollNumber;
    String grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void showTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void showStudent() {
        if (this instanceof Student) {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 101, "A");
        s1.showStudent();
        showTotalStudents();
    }
}
