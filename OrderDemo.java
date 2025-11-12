class OutOfStockException extends Exception { 
    public OutOfStockException(String message) { super(message); }
}

class PaymentFailedException extends Exception { 
    public PaymentFailedException(String message) { super(message); }
}

class OrderProcessor {
    public void placeOrder() throws OutOfStockException, PaymentFailedException { 
        double rand = Math.random();
        
        if (rand < 0.33) {
            throw new OutOfStockException("Product is out of stock."); 
        } else if (rand < 0.66) {
            throw new PaymentFailedException("Payment failed. Please check card details."); 
        }
        System.out.println("Order placed successfully!");
    }
}

public class OrderDemo {
    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();
        try {
            processor.placeOrder();
        } catch (OutOfStockException e) {
            System.out.println("Order failed: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("Order failed: " + e.getMessage());
        }
    }
}