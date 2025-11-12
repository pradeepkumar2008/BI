import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;
    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }
    public String toString() {
        return "Invoice for " + transactionId;
    }
}
public class InvoiceGenerator {
    public static void main(String[] args) {
        List<String> transactions = Arrays.asList("TXN1001", "TXN1002", "TXN1003");

        // Using constructor reference to create Invoice objects
        List<Invoice> invoices = transactions.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());
        invoices.forEach(System.out::println);
    }
}
