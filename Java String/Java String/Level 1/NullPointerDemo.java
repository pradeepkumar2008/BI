public class NullPointerDemo {
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // Causes exception
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        //generateException(); // Uncomment to see crash
        handleException();
    }
}
