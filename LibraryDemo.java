import java.util.HashMap;

class BookNotAvailableException extends Exception {  }
class UserLimitExceededException extends Exception {  }
class InvalidReturnException extends Exception {  }

class Library {
    private HashMap<String, Integer> userLimits = new HashMap<>();
    private HashMap<String, Boolean> bookAvailable = new HashMap<>();

    public Library() {
        bookAvailable.put("BookA", true);
        bookAvailable.put("BookB", false);
        userLimits.put("User1", 4);
        userLimits.put("User2", 5);
    }

    public void borrowBook(String user, String book) 
            throws BookNotAvailableException, UserLimitExceededException {
        
        if (userLimits.get(user) >= 5) {
            throw new UserLimitExceededException(); 
        }
        if (!bookAvailable.get(book)) {
            throw new BookNotAvailableException();
        }
        
        System.out.println(user + " borrowed " + book);
    }
    
    public void returnBook(String user, String book) throws InvalidReturnException {
        if (book.equals("BookC")) {
            throw new InvalidReturnException(); 
        }
        System.out.println(user + " returned " + book);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Library lib = new Library();
        try {
            lib.borrowBook("User2", "BookA");
        } catch (Exception e) {
            System.out.println("Error: " + e.getClass().getSimpleName()); 
        }
        
        try {
            lib.borrowBook("User1", "BookB");
        } catch (Exception e) {
            System.out.println("Error: " + e.getClass().getSimpleName()); 
        }
    }
}