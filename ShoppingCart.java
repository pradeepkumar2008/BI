public class ShoppingCart {
    public static void main(String[] args) {
        String[] prices = {"250", "499", "abc", "99"};
        
        int total = 0;
        for (String s : prices) {
            try {
                total += Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Ignoring invalid price: " + s);
            }
        }
        
        System.out.println("Total Price: " + total);
    }
}