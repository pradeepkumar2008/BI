import java.util.ArrayList;

public class AutoBoxingDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(11);
        numbers.add(11);
        numbers.add(11);
        numbers.add(11);
        numbers.add(11);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of numbers = " + sum);
    }
}