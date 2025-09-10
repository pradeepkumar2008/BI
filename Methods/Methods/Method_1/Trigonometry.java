import java.util.Scanner;
public class Trigonometry {
    public static double[] calculateTrigonometricFunctions(double angle){
        double rad=Math.toRadians(angle);
        double[] result=new double[3];
        result[0]=Math.sin(rad);
        result[1]=Math.cos(rad);
        result[2]=Math.tan(rad);
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double angle=sc.nextDouble();
        double[] ans=calculateTrigonometricFunctions(angle);
        System.out.println("Sine: "+ans[0]);
        System.out.println("Cosine: "+ans[1]);
        System.out.println("Tangent: "+ans[2]);
    }
}
