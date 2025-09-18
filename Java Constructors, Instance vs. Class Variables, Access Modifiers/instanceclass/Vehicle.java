package instanceclass;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 500;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John", "Car");
        v1.displayVehicleDetails();

        Vehicle.updateRegistrationFee(750);

        Vehicle v2 = new Vehicle("Alice", "Bike");
        v2.displayVehicleDetails();
    }
}
