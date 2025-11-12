class InvalidTemperatureException extends Exception { 
    public InvalidTemperatureException(String message) { super(message); }
}

public class TempConverter {

    public static double convert(double temp, String unit) throws InvalidTemperatureException { 
        if (unit.equalsIgnoreCase("C")) {
            if (temp < -273.15) { 
                throw new InvalidTemperatureException("Temperature below absolute zero."); 
            }
            return (temp * 9/5) + 32;
        } else if (unit.equalsIgnoreCase("F")) {
            if (temp < -459.67) { 
                throw new InvalidTemperatureException("Temperature below absolute zero.");
            }
            return (temp - 32) * 5/9;
        }
        throw new IllegalArgumentException("Invalid unit.");
    }

    public static void main(String[] args) {
        try {
            System.out.println("Converting -300 C...");
            convert(-300, "C");
        } catch (InvalidTemperatureException e) {
            System.out.println("Error: Temperature below absolute zero is not possible!");
        }
    }
}