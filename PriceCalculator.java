import java.util.ArrayList;
import java.util.List;

abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

class Mobile extends Product {
    public Mobile(String name, double price) {
        super(name, price);
    }
}

class Laptop extends Product {
    public Laptop(String name, double price) {
        super(name, price);
    }
}

public class PriceCalculator {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = new ArrayList<>();
        mobiles.add(new Mobile("iPhone", 999.99));
        mobiles.add(new Mobile("Samsung Galaxy", 899.99));
        System.out.println("Total price of mobiles: $" + calculateTotal(mobiles));

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("MacBook", 1299.99));
        laptops.add(new Laptop("ThinkPad", 999.99));
        System.out.println("Total price of laptops: $" + calculateTotal(laptops));
    }
}