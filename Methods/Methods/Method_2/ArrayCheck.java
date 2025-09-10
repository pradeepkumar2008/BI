import java.util.Scanner;
public class ArrayCheck {
    public static boolean isPositive(int n){ return n>0; }
    public static boolean isEven(int n){ return n%2==0; }
    public static int compare(int a,int b){
        if(a>b) return 1;
        else if(a==b) return 0;
        else return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int n:arr){
            if(isPositive(n)){
                if(isEven(n)) System.out.println(n+" is Positive and Even");
                else System.out.println(n+" is Positive and Odd");
            } else {
                System.out.println(n+" is Negative");
            }
        }
        int res=compare(arr[0],arr[4]);
        if(res==0) System.out.println("First and Last are Equal");
        else if(res==1) System.out.println("First is Greater than Last");
        else System.out.println("First is Less than Last");
    }
}
