import java.util.*;

class Package {
    String id;
    String status;
    public Package(String id, String status) { this.id = id; this.status = status; }
    public String toString() { return "Package[ID=" + id + ", Status=" + status + "]"; }
}

public class WareHouseSystem {
    public static void main(String[] args) {
        Queue<Package> pending = new LinkedList<>();
        Set<String> packageIds = new HashSet<>();
        List<Package> delivered = new ArrayList<>();
        Stack<Package> returned = new Stack<>();

        String[] ids = {"P1", "P2", "P3", "P2"};
        for (String id : ids) {
            if (packageIds.add(id)) pending.add(new Package(id, "Pending"));
        }

        System.out.println("Processing Deliveries:");
        while (!pending.isEmpty()) {
            Package p = pending.poll();
            if (Math.random() < 0.3) {
                p.status = "Returned";
                returned.push(p);
                System.out.println("Returned: " + p);
            } else {
                p.status = "Delivered";
                delivered.add(p);
                System.out.println("Delivered: " + p);
            }
        }

        System.out.println("\nDelivered Packages:");
        delivered.forEach(System.out::println);

        System.out.println("\nReturned Packages:");
        returned.forEach(System.out::println);
    }
}
