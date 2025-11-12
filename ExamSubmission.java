import java.time.LocalDateTime;

class LateSubmissionException extends Exception {  }
class InvalidFileFormatException extends Exception {  }

public class ExamSubmission {
    
    private static final LocalDateTime DEADLINE = LocalDateTime.of(2025, 1, 1, 12, 0); 

    public void submitExam(String fileName, LocalDateTime submissionTime) 
            throws LateSubmissionException, InvalidFileFormatException { 
        
        if (submissionTime.isAfter(DEADLINE)) {
            throw new LateSubmissionException(); 
        }
        if (!fileName.endsWith(".pdf")) {
            throw new InvalidFileFormatException(); 
        }
        System.out.println("Exam submitted successfully.");
    }
    
    public static void main(String[] args) {
        ExamSubmission exam = new ExamSubmission();
        try {
            exam.submitExam("answers.docx", LocalDateTime.now());
        } catch (LateSubmissionException e) {
            System.out.println("Submission failed: Too late.");
        } catch (InvalidFileFormatException e) {
            System.out.println("Submission failed: invalid file format"); 
        }
    }
}