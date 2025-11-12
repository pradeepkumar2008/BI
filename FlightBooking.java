class SeatUnavailableException extends Exception { }
class PaymentFailedException_F extends Exception {  }

public class FlightBooking {

    public void checkSeatAvailability(boolean fail) throws SeatUnavailableException { 
        if (fail) throw new SeatUnavailableException();
    }
    
    public void processPayment(boolean fail) throws PaymentFailedException_F {
        if (fail) throw new PaymentFailedException_F();
    }
    
    public void bookTicket() throws Exception { 
        checkSeatAvailability(false);
        processPayment(true); // Simulate payment failure
    }
    
    public static void main(String[] args) {
        FlightBooking fb = new FlightBooking();
        try {
            fb.bookTicket();
        } catch (SeatUnavailableException e) {
            System.out.println("Booking failed: No seats available."); 
        } catch (PaymentFailedException_F e) {
            System.out.println("Booking failed: Payment was declined."); 
        } catch (Exception e) {
            System.out.println("An unknown error occurred.");
        } finally {
            System.out.println("Thank you for booking with us!");
        }
    }
}