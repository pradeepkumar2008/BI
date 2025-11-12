public class GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {100, 50, null, 200, null};
        
        int notPlayed = 0;
        int totalScore = 0;
        
        for (Integer score : scores) {
            if (score == null) {
                notPlayed++;
            } else {
                totalScore += score;
            }
        }
        
        System.out.println("Players not played: " + notPlayed);
        System.out.println("Total valid score: " + totalScore);
    }
}