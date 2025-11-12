// File: TemperatureAlert.java
import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        double threshold = 40.0;

        // Predicate checks if the temperature is above threshold
        Predicate<Double> isHot = temp -> temp > threshold;

        double currentTemp = 42.5;

        if (isHot.test(currentTemp)) {
            System.out.println("ALERT 🚨: Temperature crossed the threshold!");
        } else {
            System.out.println("Temperature is normal.");
        }
    }
}
