import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class RatingAnalyzer {
    public static void main(String[] args) {
        int[] oldRatings = {4, 5, 3};
        ArrayList<Integer> newRatings = new ArrayList<>(Arrays.asList(5, null, 4));
        
        ArrayList<Integer> combined = new ArrayList<>();
        for (int r : oldRatings) {
            combined.add(r);
        }
        combined.addAll(newRatings);
        
        double sum = 0;
        int count = 0;
        for (Integer r : combined) {
            if (Objects.nonNull(r)) {
                sum += r;
                count++;
            }
        }
        
        double average = sum / count;
        System.out.println("Combined Ratings: " + combined);
        System.out.println("Average Rating: " + average);
    }
}