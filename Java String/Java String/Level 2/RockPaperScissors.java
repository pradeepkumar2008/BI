import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int num = (int)(Math.random() * 3);
        if (num == 0) return "rock";
        if (num == 1) return "paper";
        return "scissors";
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "draw";
        if (user.equals("rock") && comp.equals("scissors")) return "user";
        if (user.equals("scissors") && comp.equals("paper")) return "user";
        if (user.equals("paper") && comp.equals("rock")) return "user";
        return "computer";
    }

    public static void displayResults(String[][] results, int userWins, int compWins, int games) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i+1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t" + results[i][2]);
        }
        System.out.println("\nUser Wins: " + userWins + " (" + (userWins*100/games) + "%)");
        System.out.println("Computer Wins: " + compWins + " (" + (compWins*100/games) + "%)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();

        String[][] results = new String[games][3];
        int userWins = 0, compWins = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String user = sc.nextLine();
            String comp = getComputerChoice();
            String winner = findWinner(user, comp);

            results[i][0] = user;
            results[i][1] = comp;
            results[i][2] = winner;

            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) compWins++;
        }

        displayResults(results, userWins, compWins, games);
    }
}
