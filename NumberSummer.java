import java.util.Arrays;
import java.util.List;

public class NumberSummer {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum of integers: " + sumNumbers(integers));

        List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println("Sum of doubles: " + sumNumbers(doubles));
    }
}