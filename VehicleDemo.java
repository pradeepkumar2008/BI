class ServiceOverdueException extends Exception {  }
class InvalidMileageException extends Exception {  }

class VehicleTracker {
    public void checkMaintenance(int mileage, boolean isServiceOverdue) 
            throws ServiceOverdueException, InvalidMileageException { 
        
        if (mileage < 0) {
            throw new InvalidMileageException();
        }
        if (isServiceOverdue) {
            throw new ServiceOverdueException();
        }
        System.out.println("Vehicle maintenance is up to date.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        VehicleTracker tracker = new VehicleTracker();
        try {
            tracker.checkMaintenance(-50, false);
        } catch (InvalidMileageException e) {
            System.out.println("Notification: Invalid mileage entered.");
        } catch (ServiceOverdueException e) {
            System.out.println("Notification: Vehicle service is overdue!");
        }
    }
}