
import java.util.*;
public class RotatedList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int rotateBy=2;
        ArrayList<Integer> rotatedArray=new ArrayList<>();
        for(int i=rotateBy;i<list.size();i++){
            rotatedArray.add(list.get(i));
        }
        for(int i=0;i<rotateBy;i++){
            rotatedArray.add(list.get(i));
        }
        System.out.println(rotatedArray);

    }
    
}
