package Encapsulation_Polymorphism;
import java.util.*;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

    public abstract double calculateDiscount();

    public void printFinalPrice() {
        double discount = calculateDiscount();
        double tax = (this instanceof Taxable) ? ((Taxable)this).calculateTax() : 0;
        double finalPrice = getPrice() + tax - discount;
        System.out.println("Product: " + getName() +
                " | Base Price: " + getPrice() +
                " | Discount: " + discount +
                " | Tax: " + tax +
                " | Final Price: " + finalPrice);
    }
}

class Electronics extends Product implements Taxable {
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }
    public double calculateDiscount() { return getPrice() * 0.10; }
    public double calculateTax() { return getPrice() * 0.18; }
    public String getTaxDetails() { return "18% GST applied on Electronics"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }
    public double calculateDiscount() { return getPrice() * 0.20; }
    public double calculateTax() { return getPrice() * 0.05; }
    public String getTaxDetails() { return "5% Tax applied on Clothing"; }
}

class Groceries extends Product {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }
    public double calculateDiscount() { return getPrice() * 0.05; }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter product type (1-Electronics, 2-Clothing, 3-Groceries): ");
            int type = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Product ID: ");
            String id = sc.nextLine();
            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            if (type == 1) products.add(new Electronics(id, name, price));
            else if (type == 2) products.add(new Clothing(id, name, price));
            else if (type == 3) products.add(new Groceries(id, name, price));
            else System.out.println("Invalid type, skipping...");
        }

        System.out.println("\n=== Final Price Calculation ===");
        for (Product p : products) {
            p.printFinalPrice();
        }
    }
}
