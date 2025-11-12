import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    private String id;
    private String model;

    public Vehicle(String id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - ID: " + id + ", Model: " + model;
    }
}

class Truck extends Vehicle {
    public Truck(String id, String model) {
        super(id, model);
    }
}

class Bike extends Vehicle {
    public Bike(String id, String model) {
        super(id, model);
    }
}

public class FleetManager<T extends Vehicle> {
    private List<T> fleet;

    public FleetManager() {
        fleet = new ArrayList<>();
    }

    public void addVehicle(T vehicle) {
        fleet.add(vehicle);
    }

    public void showFleet() {
        System.out.println("Fleet contains:");
        for (T vehicle : fleet) {
            System.out.println("- " + vehicle);
        }
    }

    public static void main(String[] args) {
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck("T001", "Volvo FH16"));
        truckFleet.addVehicle(new Truck("T002", "Mercedes Actros"));
        System.out.println("Truck Fleet:");
        truckFleet.showFleet();

        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike("B001", "Honda CBR"));
        bikeFleet.addVehicle(new Bike("B002", "Yamaha R1"));
        System.out.println("\nBike Fleet:");
        bikeFleet.showFleet();
    }
}