import java.util.Scanner;
public class SimpleInterest {
    static double simpleInterest(double p,double r,double t){
        return (p*r*t)/100;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        double t=sc.nextDouble();
        double si=simpleInterest(p,r,t);
        System.out.println("The Simple Interest is "+si+" for Principal "+p+", Rate of Interest "+r+" and Time "+t);
    }
}
