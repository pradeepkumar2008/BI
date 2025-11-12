import java.util.*;
public class PatientID {
    public static void main(String[] args) {
        List<String> patientIDs = Arrays.asList("P101", "P102", "P103", "P104");

        // Using method reference instead of lambda
        patientIDs.forEach(System.out::println);
    }
}
