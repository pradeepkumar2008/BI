import java.util.Scanner;
public class TriangularPark {
    static int rounds(double a,double b,double c){
        double perimeter=a+b+c;
        return (int)Math.ceil(5000/perimeter);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        System.out.println("Rounds: "+rounds(a,b,c));
    }
}
