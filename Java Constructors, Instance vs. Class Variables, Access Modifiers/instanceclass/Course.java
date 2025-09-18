package instanceclass;

public class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "ABC Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 1500);
        c1.displayCourseDetails();

        Course.updateInstituteName("XYZ Institute");

        Course c2 = new Course("Python", 8, 2000);
        c2.displayCourseDetails();
    }
}
