import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCopier {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        dest.addAll(src);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(4.4, 5.5);
        List<Number> numbers = new ArrayList<>();

        copyList(numbers, integers);
        System.out.println("After copying integers: " + numbers);
        
        copyList(numbers, doubles);
        System.out.println("After copying doubles: " + numbers);
    }
}