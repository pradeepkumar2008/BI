// File: UnitConverter.java
interface UnitConverter {
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double kgToPounds(double kg) {
        return kg * 2.20462;
    }
}

public class ConversionDemo {
    public static void main(String[] args) {
        double km = 10;
        double kg = 5;

        System.out.println(km + " km = " + UnitConverter.kmToMiles(km) + " miles");
        System.out.println(kg + " kg = " + UnitConverter.kgToPounds(kg) + " pounds");
    }
}
