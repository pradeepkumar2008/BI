import java.util.*;

public class CountryCapitalLookup {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        countries.put("India", "New Delhi");
        countries.put("USA", "Washington D.C.");
        countries.put("France", "Paris");
        countries.put("Germany", "Berlin");
        countries.put("Japan", "Tokyo");
        countries.put("Canada", "Ottawa");
        countries.put("Australia", "Canberra");
        countries.put("Brazil", "Brasília");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a country name: ");
        String country = sc.nextLine();

        if (countries.containsKey(country))
            System.out.println("Capital of " + country + " is " + countries.get(country));
        else
            System.out.println("Unknown country");

        System.out.println("\nAll countries (alphabetical order):");
        List<String> sortedCountries = new ArrayList<>(countries.keySet());
        Collections.sort(sortedCountries);

        for (String c : sortedCountries) {
            System.out.println(c + " → " + countries.get(c));
        }
    }
}
