import java.util.*;

public class WebsiteVisitTracker {
    public static void main(String[] args) {
        Map<String, Integer> visits = new HashMap<>();

        String[] pages = {"home", "about", "products", "home", "products", "contact", "home"};

        for (String page : pages) {
            visits.put(page, visits.getOrDefault(page, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(visits.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("Page Visit Report (Descending Order):");
        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + " - " + e.getValue() + " visits");
        }

        Map.Entry<String, Integer> top = list.get(0);
        System.out.println("\nMost visited page: " + top.getKey() + " (" + top.getValue() + " visits)");
    }
}
