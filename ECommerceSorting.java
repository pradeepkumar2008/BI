import java.util.*;

class Product {
    String name;
    double price, rating, discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " (₹" + price + "," + rating + ", " + discount + "% off)";
    }
}

public class ECommerceSorting {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 85000, 4.6, 10),
                new Product("Phone", 50000, 4.8, 15),
                new Product("Tablet", 30000, 4.3, 5)
        );

        // Sort by price
        products.sort((a, b) -> Double.compare(a.price, b.price));
        System.out.println("By Price: " + products);

        // Sort by rating
        products.sort((a, b) -> Double.compare(b.rating, a.rating));
        System.out.println("By Rating: " + products);

        // Sort by discount
        products.sort((a, b) -> Double.compare(b.discount, a.discount));
        System.out.println("By Discount: " + products);
    }
}
