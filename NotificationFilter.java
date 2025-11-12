import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return type + ": " + message;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
                new Alert("Critical", "Low oxygen level!"),
                new Alert("General", "Appointment tomorrow."),
                new Alert("Reminder", "Take medicine at 9 AM."),
                new Alert("Critical", "High blood pressure detected!")
        );

        // User preference: only show critical alerts
        Predicate<Alert> criticalOnly = a -> a.type.equalsIgnoreCase("Critical");

        // Filter alerts using lambda
        alerts.stream()
                .filter(criticalOnly)
                .forEach(System.out::println);
    }
}
