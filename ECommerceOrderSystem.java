import java.util.*;

class Order {
    int orderId;
    String customerName;
    double amount;

    public Order(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Order)) return false;
        Order o = (Order) obj;
        return this.orderId == o.orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }

    @Override
    public String toString() {
        return "Order[ID=" + orderId + ", Customer=" + customerName + ", Amount=" + amount + "]";
    }
}

public class ECommerceOrderSystem {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order(101, "Akshat", 2500.0));
        orderList.add(new Order(102, "Riya", 1500.0));
        orderList.add(new Order(103, "Arjun", 3000.0));
        orderList.add(new Order(101, "Akshat", 2500.0));

        System.out.println("All Orders (with duplicates):");
        orderList.forEach(System.out::println);

        Set<Order> uniqueOrders = new HashSet<>(orderList);
        System.out.println("\nUnique Orders:");
        uniqueOrders.forEach(System.out::println);

        Queue<Order> processingQueue = new LinkedList<>(uniqueOrders);
        Stack<Order> failedOrders = new Stack<>();

        System.out.println("\nProcessing Orders...");
        while (!processingQueue.isEmpty()) {
            Order order = processingQueue.poll();
            if (Math.random() < 0.3) {
                System.out.println("Order failed: " + order);
                failedOrders.push(order);
            } else {
                System.out.println("Order processed: " + order);
            }
        }

        System.out.println("\nRe-processing Failed Orders...");
        while (!failedOrders.isEmpty()) {
            Order failedOrder = failedOrders.pop();
            System.out.println("Retrying order: " + failedOrder);
            System.out.println("Order reprocessed: " + failedOrder);
        }

        System.out.println("\nAll orders processed.");
    }
}
