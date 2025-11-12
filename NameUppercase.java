import java.util.*;
import java.util.stream.Collectors;

public class NameUppercase {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Asha", "Ravi", "Meena", "Karan");

        // Convert all names to uppercase using method reference
        List<String> upperNames = employees.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperNames);
    }
}
