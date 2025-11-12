import java.util.*;

public class LibraryBookCatalog {
    public static void main(String[] args) {
        Map<String, String> catalog = new HashMap<>();

        catalog.put("978-1234567890", "Java Programming");
        catalog.put("978-0987654321", "Data Structures");
        catalog.put("978-1111111111", "Algorithms Unlocked");
        catalog.put("978-2222222222", "Clean Code");
        catalog.put("978-3333333333", "Design Patterns");

        String searchISBN = "978-0987654321";
        if (catalog.containsKey(searchISBN))
            System.out.println("Book found: " + catalog.get(searchISBN));
        else
            System.out.println("Book not found");

        catalog.remove("978-1111111111");

        System.out.println("\nAll books sorted by ISBN:");
        List<String> sortedISBNs = new ArrayList<>(catalog.keySet());
        Collections.sort(sortedISBNs);
        for (String isbn : sortedISBNs) {
            System.out.println(isbn + " - " + catalog.get(isbn));
        }

        String searchTitle = "Clean Code";
        boolean found = false;
        for (Map.Entry<String, String> e : catalog.entrySet()) {
            if (e.getValue().equalsIgnoreCase(searchTitle)) {
                System.out.println("\nFound by title: " + e.getKey() + " - " + e.getValue());
                found = true;
                break;
            }
        }
        if (!found) System.out.println("\nBook not found by title");
    }
}
