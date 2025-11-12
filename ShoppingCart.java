import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

        cart.put("Laptop", 45000.0);
        cart.put("Mouse", 800.0);
        cart.put("Keyboard", 1200.0);
        cart.put("Charger", 1500.0);
        cart.put("Bag", 900.0);

        System.out.println("Products in cart (in order added):");
        for (Map.Entry<String, Double> e : cart.entrySet()) {
            System.out.println(e.getKey() + " - ₹" + e.getValue());
        }

        double total = 0;
        for (double price : cart.values()) total += price;

        if (total > 5000) total *= 0.9;

        cart.remove("Bag");

        System.out.println("\nAfter removing items (if quantity = 0):");
        for (Map.Entry<String, Double> e : cart.entrySet()) {
            System.out.println(e.getKey() + " - ₹" + e.getValue());
        }

        System.out.println("\nTotal Bill: ₹" + total);
    }
}
