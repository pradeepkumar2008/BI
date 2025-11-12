// File: DateFormatter.java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatter {
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class InvoiceDateDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("Default: " + DateFormatter.formatDate(today, "yyyy-MM-dd"));
        System.out.println("Pretty: " + DateFormatter.formatDate(today, "dd MMM yyyy"));
        System.out.println("Invoice Style: " + DateFormatter.formatDate(today, "dd/MM/yyyy"));
    }
}
