// File: PrototypeClone.java
class Product implements Cloneable {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // clone() works only if class implements Cloneable
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}

public class PrototypeDemo {
    public static void main(String[] args) {
        try {
            Product original = new Product("AI Sensor", 999.99);
            Product clone = (Product) original.clone();

            System.out.println("Original: " + original);
            System.out.println("Cloned:   " + clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
