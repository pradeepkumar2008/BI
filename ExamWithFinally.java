import java.io.IOException;

class InvalidStudentException extends Exception {  }

public class ExamWithFinally {

    public void validateStudent(String studentId) throws InvalidStudentException { 
        if (studentId.equals("invalid")) {
            throw new InvalidStudentException();
        }
    }

    public void submitExam(String studentId) throws InvalidStudentException, IOException { 
        validateStudent(studentId);
        if (studentId.equals("io_error")) {
            throw new IOException("File read error"); 
        }
        System.out.println("Exam submitted by " + studentId);
    }
    
    public static void main(String[] args) {
        ExamWithFinally exam = new ExamWithFinally();
        try {
            exam.submitExam("invalid");
        } catch (InvalidStudentException e) {
            System.out.println("Detailed Error: Student is not valid.");
        } catch (IOException e) {
            System.out.println("Detailed Error: A file error occurred.");
        } finally {
            System.out.println("Exam submission process completed.");
        }
    }
}