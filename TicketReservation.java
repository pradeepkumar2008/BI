import java.util.*;

class Booking implements Comparable<Booking> {
    String user;
    boolean isVIP;

    public Booking(String user, boolean isVIP) {
        this.user = user;
        this.isVIP = isVIP;
    }

    public int compareTo(Booking b) {
        return Boolean.compare(b.isVIP, this.isVIP);
    }

    public String toString() {
        return user + (isVIP ? " (VIP)" : "");
    }
}

public class TicketReservation {
    public static void main(String[] args) {
        List<Booking> confirmedBookings = new ArrayList<>();
        Set<String> registeredUsers = new HashSet<>();
        Queue<Booking> bookingQueue = new LinkedList<>();
        PriorityQueue<Booking> vipQueue = new PriorityQueue<>();

        String[] users = {"Akshat", "Riya", "Arjun", "Akshat"};
        for (String u : users) {
            registeredUsers.add(u);
        }

        bookingQueue.add(new Booking("Akshat", false));
        bookingQueue.add(new Booking("Riya", true));
        bookingQueue.add(new Booking("Arjun", false));

        while (!bookingQueue.isEmpty()) {
            vipQueue.add(bookingQueue.poll());
        }

        System.out.println("Processing Bookings:");
        while (!vipQueue.isEmpty()) {
            Booking b = vipQueue.poll();
            confirmedBookings.add(b);
            System.out.println("Confirmed: " + b);
        }

        System.out.println("\nAll Confirmed Bookings:");
        confirmedBookings.forEach(System.out::println);
    }
}

