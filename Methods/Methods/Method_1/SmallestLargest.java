import java.util.Scanner;
public class SmallestLargest {
    static void smallestLargest(int a,int b,int c){
        int min=Math.min(a,Math.min(b,c));
        int max=Math.max(a,Math.max(b,c));
        System.out.println("Smallest: "+min+" Largest: "+max);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        smallestLargest(x,y,z);
    }
}
