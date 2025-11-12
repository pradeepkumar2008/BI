public class LoginValidator {

    public static boolean validateAge(String ageInput) {
        try {
            int age = Integer.parseInt(ageInput);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Is '25' valid? " + validateAge("25"));
        System.out.println("Is '17' valid? " + validateAge("17"));
        System.out.println("Is 'abc' valid? " + validateAge("abc"));
    }
}