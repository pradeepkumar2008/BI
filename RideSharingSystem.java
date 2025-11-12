import java.util.*;

class RideRequest implements Comparable<RideRequest> {
    int requestId;
    int priority;
    String pickupLocation;

    public RideRequest(int requestId, int priority, String pickupLocation) {
        this.requestId = requestId;
        this.priority = priority;
        this.pickupLocation = pickupLocation;
    }

    public int compareTo(RideRequest r) {
        return r.priority - this.priority;
    }

    public String toString() {
        return "Request[ID=" + requestId + ", Priority=" + priority + ", Pickup=" + pickupLocation + "]";
    }
}

class Driver {
    String driverId;
    String name;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
    }

    public String toString() {
        return "Driver[ID=" + driverId + ", Name=" + name + "]";
    }
}

class Ride {
    RideRequest request;
    Driver driver;

    public Ride(RideRequest request, Driver driver) {
        this.request = request;
        this.driver = driver;
    }

    public String toString() {
        return "Ride completed: " + request + " by " + driver;
    }
}

public class RideSharingSystem {
    public static void main(String[] args) {
        Queue<RideRequest> pendingRequests = new LinkedList<>();
        PriorityQueue<RideRequest> priorityRequests = new PriorityQueue<>();
        Set<Driver> availableDrivers = new HashSet<>();
        List<Ride> completedRides = new ArrayList<>();

        availableDrivers.add(new Driver("D1", "Ravi"));
        availableDrivers.add(new Driver("D2", "Sneha"));

        pendingRequests.add(new RideRequest(1, 2, "Mall Road"));
        pendingRequests.add(new RideRequest(2, 5, "Airport"));
        pendingRequests.add(new RideRequest(3, 1, "Station"));

        while (!pendingRequests.isEmpty()) {
            priorityRequests.add(pendingRequests.poll());
        }

        System.out.println("Assigning Rides (High Priority First):");
        Iterator<Driver> driverIterator = availableDrivers.iterator();
        while (!priorityRequests.isEmpty() && driverIterator.hasNext()) {
            RideRequest req = priorityRequests.poll();
            Driver drv = driverIterator.next();
            Ride ride = new Ride(req, drv);
            completedRides.add(ride);
            System.out.println(ride);
        }

        System.out.println("\nCompleted Rides:");
        completedRides.forEach(System.out::println);
    }
}
