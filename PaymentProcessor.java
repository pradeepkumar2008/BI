// File: PaymentProcessor.java
interface PaymentProcessor {
    void processPayment(double amount);

    // Default method added later — doesn't break old implementations
    default void refund(double amount) {
        System.out.println("Refund feature not supported by this provider.");
    }
}

// Old payment provider
class PayPalProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing payment of ₹" + amount + " via PayPal.");
    }
}

// New provider overrides refund feature
class StripeProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing payment of ₹" + amount + " via Stripe.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " through Stripe.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPalProcessor();
        PaymentProcessor stripe = new StripeProcessor();

        paypal.processPayment(500);
        paypal.refund(200);

        stripe.processPayment(700);
        stripe.refund(300);
    }
}
