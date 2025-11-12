import java.util.*;

class Product {
    String name;
    double price;
    int stock;

    public Product(String name, double price, int stock) {
        this.name = name; this.price = price; this.stock = stock;
    }

    public String toString() {
        return name + " (₹" + price + ", Stock: " + stock + ")";
    }
}

public class InventorySystem {
    public static void main(String[] args) {
        Set<String> productNames = new HashSet<>();
        List<Product> products = new ArrayList<>();
        Queue<Product> restockQueue = new LinkedList<>();
        Stack<Product> restockedStack = new Stack<>();

        Product p1 = new Product("Milk", 50, 2);
        Product p2 = new Product("Bread", 30, 1);
        Product p3 = new Product("Eggs", 60, 10);

        for (Product p : Arrays.asList(p1, p2, p3)) {
            if (productNames.add(p.name)) products.add(p);
        }

        System.out.println("All Products:");
        products.forEach(System.out::println);

        for (Product p : products) {
            if (p.stock < 3) restockQueue.add(p);
        }

        System.out.println("\nRestocking Products:");
        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.poll();
            p.stock += 10;
            restockedStack.push(p);
            System.out.println("Restocked: " + p);
        }

        System.out.println("\nUndo Last Restock:");
        if (!restockedStack.isEmpty()) {
            Product last = restockedStack.pop();
            last.stock -= 10;
            System.out.println("Undo: " + last);
        }

        System.out.println("\nFinal Inventory:");
        products.forEach(System.out::println);
    }
}
