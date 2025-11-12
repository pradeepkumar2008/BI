import java.util.ArrayList;

public class PerformanceTest {
    public static void main(String[] args) {
        int size = 1_000_000;

        
        int[] primitiveArray = new int[size];
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            primitiveArray[i] = i;
        }
        long sum = 0;
        for (int i = 0; i < size; i++) {
            sum += primitiveArray[i];
        }
        long end = System.nanoTime();
        System.out.println("int[] time: " + (end - start) + " ns");

        
        ArrayList<Integer> wrapperList = new ArrayList<>(size);
        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            wrapperList.add(i);
        }
        long wrapperSum = 0;
        for (int num : wrapperList) {
            wrapperSum += num;
        }
        end = System.nanoTime();
        System.out.println("ArrayList<Integer> time: " + (end - start) + " ns");
    }
}