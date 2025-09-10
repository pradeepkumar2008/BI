import java.util.Scanner;
public class SumNaturalCompare {
    public static int recursiveSum(int n){
        if(n==0) return 0;
        return n+recursiveSum(n-1);
    }
    public static int formulaSum(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0) System.out.println("Not a natural number");
        else {
            int r1=recursiveSum(n);
            int r2=formulaSum(n);
            System.out.println("Recursive Sum: "+r1);
            System.out.println("Formula Sum: "+r2);
            System.out.println("Results Match: "+(r1==r2));
        }
    }
}
