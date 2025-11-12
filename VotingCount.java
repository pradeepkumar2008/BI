import java.util.*;

public class VotingCount {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        String[] castVotes = {
            "Alice", "Bob", "Alice", "Charlie", "Bob",
            "Alice", "Charlie", "Alice", "Bob", "Alice"
        };

        for (String name : castVotes) {
            votes.put(name, votes.getOrDefault(name, 0) + 1);
        }

        System.out.println("Vote Count:");
        for (Map.Entry<String, Integer> e : votes.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        String winner = "";
        int maxVotes = 0;
        for (Map.Entry<String, Integer> e : votes.entrySet()) {
            if (e.getValue() > maxVotes) {
                maxVotes = e.getValue();
                winner = e.getKey();
            }
        }

        System.out.println("\nWinner: " + winner + " with " + maxVotes + " votes");
    }
}
