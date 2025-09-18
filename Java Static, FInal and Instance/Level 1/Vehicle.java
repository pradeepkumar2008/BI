public class Vehicle {

    static double registrationFee = 1000.0;

    String ownerName;
    String vehicleType;
    final String registrationNumber;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("New Registration Fee: " + registrationFee);
    }

    void showVehicle() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Sita", "Bike", "VEH123");
        v1.showVehicle();
        updateRegistrationFee(1200.0);
    }
}
