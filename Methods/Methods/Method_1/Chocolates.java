import java.util.Scanner;
public class Chocolates {
    public static int[] findRemainderAndQuotient(int number,int divisor){
        int[] result=new int[2];
        result[0]=number/divisor;
        result[1]=number%divisor;
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int chocolates=sc.nextInt();
        int children=sc.nextInt();
        int[] ans=findRemainderAndQuotient(chocolates,children);
        System.out.println("Each child gets: "+ans[0]+" chocolates");
        System.out.println("Remaining chocolates: "+ans[1]);
    }
}
