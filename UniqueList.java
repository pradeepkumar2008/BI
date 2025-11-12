import java.util.*;
public class UniqueList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,1,2,14,5,6,6,7,8,9,3,4,25));
        ArrayList<Integer> uniqueList=new ArrayList<>();
        for(int num:list){
            if(!uniqueList.contains(num)){
                uniqueList.add(num);
            }
        }
        System.out.println(uniqueList);


    }
    
}
