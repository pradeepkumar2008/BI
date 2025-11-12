import java.util.ArrayList;

public class SensorLogger {
    
    static ArrayList<Double> sensorLog = new ArrayList<>();

    public static void logTemperature(Double temp) {
        sensorLog.add(temp);
        System.out.println("Logged: " + temp);
    }
    
    public static void main(String[] args) {
        double primitiveTemp = 37.5;
        logTemperature(primitiveTemp);
        
        Double wrapperTemp = 40.1;
        logTemperature(wrapperTemp);
        
        double readValue = sensorLog.get(0);
        System.out.println("Read back primitive: " + readValue);
    }
}