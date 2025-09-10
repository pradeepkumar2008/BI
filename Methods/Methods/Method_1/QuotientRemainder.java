import java.util.Scanner;
public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number,int divisor){
        int[] result=new int[2];
        result[0]=number/divisor;
        result[1]=number%divisor;
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int div=sc.nextInt();
        int[] ans=findRemainderAndQuotient(num,div);
        System.out.println("Quotient: "+ans[0]+" Remainder: "+ans[1]);
    }
}
