import java.util.ArrayList;
import java.util.Collections;

public class EmployeeData {
    public static void main(String[] args) {
        int[] ages = {45, 22, 50, 33, 28};
        
        ArrayList<Integer> ageList = new ArrayList<>();
        for (int age : ages) {
            ageList.add(age);
        }
        
        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);
        
        System.out.println("Converted List: " + ageList);
        System.out.println("Youngest Employee Age: " + youngest);
        System.out.println("Oldest Employee Age: " + oldest);
    }
}