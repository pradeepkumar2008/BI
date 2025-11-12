import java.util.*;
public class ReverseList{
    public static void main(String [] args){
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
         LinkedList<Integer> list1=new LinkedList<>(Arrays.asList(1,2,3,4,5));
        
        int left=0;
        int right=list.size()-1;
        while(left<right){
            int temp=list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
        int left1=0;
        int right1=list1.size()-1;
        while(left1<right1){
            int temp1=list1.get(left1);
            list1.set(left1,list1.get(right1));
            list1.set(right,temp1);
            left1++;
            right1--;
        }
        System.out.println(list);
        System.out.println(list1);
        

    }
}