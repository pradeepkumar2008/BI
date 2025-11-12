// File: SmartVehicle.java
interface SmartVehicle {
    void displaySpeed();

    // Default method for electric vehicles
    default void displayBattery() {
        System.out.println("Battery status feature not available for this vehicle.");
    }
}

class Car implements SmartVehicle {
    public void displaySpeed() {
        System.out.println("Speed: 80 km/h");
    }
}

class ElectricCar implements SmartVehicle {
    public void displaySpeed() {
        System.out.println("Speed: 100 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("Battery: 85% charged ⚡");
    }
}

public class DashboardDemo {
    public static void main(String[] args) {
        SmartVehicle normalCar = new Car();
        SmartVehicle eCar = new ElectricCar();

        System.out.println("Normal Car:");
        normalCar.displaySpeed();
        normalCar.displayBattery();

        System.out.println("\nElectric Car:");
        eCar.displaySpeed();
        eCar.displayBattery();
    }
}
