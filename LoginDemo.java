class InvalidCredentialsException extends Exception { 
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

class LoginSystem {
    private static final String VALID_USER = "admin";
    private static final String VALID_PASS = "pass123";

    public void validate(String user, String pass) throws InvalidCredentialsException { 
        if (!user.equals(VALID_USER) || !pass.equals(VALID_PASS)) {
            throw new InvalidCredentialsException("Invalid username or password.");
        }
        System.out.println("Login successful!");
    }
}

public class LoginDemo {
    public static void main(String[] args) {
        LoginSystem login = new LoginSystem();
        try {
            login.validate("admin", "wrongpass");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
            System.out.println("Please try again.");
        }
    }
}