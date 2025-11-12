class InvalidRatingException extends Exception { }
class EmptyReviewException extends Exception {  }

public class ReviewSystem {
    
    public void submitReview(int rating, String comment) 
            throws InvalidRatingException, EmptyReviewException { 
        
        if (rating < 1 || rating > 5) {
            throw new InvalidRatingException();
        }
        if (comment == null || comment.trim().isEmpty()) {
            throw new EmptyReviewException(); 
        }
        System.out.println("Review submitted!");
    }
    
    public static void main(String[] args) {
        ReviewSystem rs = new ReviewSystem();
        try {
            rs.submitReview(5, "  ");
        } catch (InvalidRatingException e) {
            System.out.println("Error: Rating must be between 1 and 5.");
        } catch (EmptyReviewException e) {
            System.out.println("Error: Comment cannot be empty."); 
        }
    }
}