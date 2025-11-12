import java.util.*;

public class InventoryManagement {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();

        inventory.put("Apples", 50);
        inventory.put("Bananas", 30);
        inventory.put("Oranges", 20);
        inventory.put("Milk", 10);
        inventory.put("Bread", 15);

        sellProduct(inventory, "Apples", 20);
        sellProduct(inventory, "Milk", 10);
        sellProduct(inventory, "Oranges", 25);

        restockProduct(inventory, "Bread", 10);
        restockProduct(inventory, "Milk", 5);

        queryProduct(inventory, "Milk");
        queryProduct(inventory, "Oranges");

        System.out.println("\nCurrent Inventory:");
        for (Map.Entry<String, Integer> e : inventory.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        System.out.println("\nOut of Stock Products:");
        for (Map.Entry<String, Integer> e : inventory.entrySet()) {
            if (e.getValue() == 0)
                System.out.println(e.getKey());
        }
    }

    static void sellProduct(Map<String, Integer> map, String product, int qty) {
        int current = map.getOrDefault(product, 0);
        current -= qty;
        if (current <= 0) {
            map.put(product, 0);
            System.out.println(product + " is now out of stock.");
        } else {
            map.put(product, current);
        }
    }

    static void restockProduct(Map<String, Integer> map, String product, int qty) {
        map.put(product, map.getOrDefault(product, 0) + qty);
        System.out.println(product + " restocked. New quantity: " + map.get(product));
    }

    static void queryProduct(Map<String, Integer> map, String product) {
        if (map.containsKey(product))
            System.out.println(product + " remaining: " + map.get(product));
        else
            System.out.println(product + " not stocked.");
    }
}
