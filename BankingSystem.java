import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        HashMap<String, Double> accounts = new HashMap<>();

        accounts.put("A101", 15000.0);
        accounts.put("A102", 32000.0);
        accounts.put("A103", 5000.0);
        accounts.put("A104", 25000.0);
        accounts.put("A105", 48000.0);

        deposit(accounts, "A103", 2000);
        withdraw(accounts, "A101", 17000);
        withdraw(accounts, "A104", 26000);

        List<Map.Entry<String, Double>> list = new ArrayList<>(accounts.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("All customers sorted by descending balance:");
        for (Map.Entry<String, Double> e : list) {
            System.out.println(e.getKey() + " - ₹" + e.getValue());
        }

        System.out.println("\nTop 3 customers:");
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            Map.Entry<String, Double> e = list.get(i);
            System.out.println((i + 1) + ". " + e.getKey() + " - ₹" + e.getValue());
        }
    }

    static void deposit(HashMap<String, Double> map, String acc, double amount) {
        map.put(acc, map.getOrDefault(acc, 0.0) + amount);
    }

    static void withdraw(HashMap<String, Double> map, String acc, double amount) {
        double balance = map.getOrDefault(acc, 0.0);
        if (balance >= amount) map.put(acc, balance - amount);
        else System.out.println("Insufficient balance in " + acc);
    }
}
