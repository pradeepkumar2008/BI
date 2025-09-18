public class Product {

    static double discount = 5.0;

    String productName;
    double price;
    int quantity;
    final String productID;

    Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount Updated to: " + discount + "%");
    }

    void showProduct() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Phone", 30000, 1, "P001");
        p1.showProduct();
        updateDiscount(10.0);
    }
}
