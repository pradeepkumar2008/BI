
interface Category {
    String getType();
}

enum BookCategory implements Category {
    FICTION, NON_FICTION, EDUCATIONAL;
    public String getType() { return name(); }
}

enum ClothingCategory implements Category {
    MENS, WOMENS, KIDS;
    public String getType() { return name(); }
}

enum GadgetCategory implements Category {
    PHONES, LAPTOPS, ACCESSORIES;
    public String getType() { return name(); }
}

class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " (" + category.getType() + ") - $" + price;
    }
}

public class OnlineMarketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() * (1 - percentage / 100);
        product.setPrice(discountedPrice);
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 49.99, BookCategory.EDUCATIONAL);
        Product<ClothingCategory> shirt = new Product<>("Summer T-Shirt", 29.99, ClothingCategory.MENS);
        Product<GadgetCategory> phone = new Product<>("Smartphone", 599.99, GadgetCategory.PHONES);

        System.out.println("Before discounts:");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);

        applyDiscount(book, 20);
        applyDiscount(shirt, 30);
        applyDiscount(phone, 15);

        System.out.println("\nAfter discounts:");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);
    }
}