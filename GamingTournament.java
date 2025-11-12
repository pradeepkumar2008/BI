import java.util.*;

class Player {
    String name;
    public Player(String name) { this.name = name; }
    public String toString() { return name; }
}

class Match {
    String player1, player2;
    public Match(String p1, String p2) { this.player1 = p1; this.player2 = p2; }
    public String toString() { return player1 + " vs " + player2; }
}

class Result {
    String winner;
    int score;
    public Result(String winner, int score) { this.winner = winner; this.score = score; }
    public String toString() { return "Winner: " + winner + ", Score: " + score; }
}

class Score implements Comparable<Score> {
    String player;
    int points;
    public Score(String player, int points) { this.player = player; this.points = points; }
    public int compareTo(Score s) { return s.points - this.points; }
    public String toString() { return player + " - " + points + " pts"; }
}

public class GamingTournament {
    public static void main(String[] args) {
        Set<Player> players = new HashSet<>();
        Queue<Match> matchQueue = new LinkedList<>();
        List<Result> results = new ArrayList<>();
        TreeSet<Score> leaderboard = new TreeSet<>();

        players.add(new Player("Akshat"));
        players.add(new Player("Riya"));
        players.add(new Player("Arjun"));
        players.add(new Player("Akshat"));

        System.out.println("Registered Players:");
        players.forEach(System.out::println);

        matchQueue.add(new Match("Akshat", "Riya"));
        matchQueue.add(new Match("Arjun", "Riya"));

        System.out.println("\nProcessing Matches:");
        while (!matchQueue.isEmpty()) {
            Match m = matchQueue.poll();
            String winner = Math.random() < 0.5 ? m.player1 : m.player2;
            int score = (int)(Math.random() * 100);
            results.add(new Result(winner, score));
            leaderboard.add(new Score(winner, score));
            System.out.println("Match: " + m + " | Winner: " + winner);
        }

        System.out.println("\nResults:");
        results.forEach(System.out::println);

        System.out.println("\nLeaderboard:");
        leaderboard.forEach(System.out::println);
    }
}
