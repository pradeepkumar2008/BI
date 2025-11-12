
import java.util.*;

public class FrequencyOfElements {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList("apple","banana","apple","orange"));
        System.out.println(list);
        HashMap<String,Integer> frequency=new HashMap<>();
        for(String fruit: list){
            if(frequency.containsKey(fruit)){
                frequency.put(fruit,frequency.get(fruit)+1);
            }
            else{
                frequency.put(fruit,1);
            }

        }
        System.out.print(frequency);
        
    }
}

