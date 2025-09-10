import java.util.Scanner;
public class BMICalculator {
    public static double calculateBMI(double weight,double heightCm){
        double heightM=heightCm/100;
        return weight/(heightM*heightM);
    }
    public static String getStatus(double bmi){
        if(bmi<18.5) return "Underweight";
        else if(bmi<24.9) return "Normal";
        else if(bmi<29.9) return "Overweight";
        else return "Obese";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[][] data=new double[10][3];
        String[] status=new String[10];
        for(int i=0;i<10;i++){
            double w=sc.nextDouble();
            double h=sc.nextDouble();
            data[i][0]=w;
            data[i][1]=h;
            data[i][2]=calculateBMI(w,h);
            status[i]=getStatus(data[i][2]);
        }
        for(int i=0;i<10;i++){
            System.out.println("Person "+(i+1)+": Weight="+data[i][0]+"kg Height="+data[i][1]+"cm BMI="+data[i][2]+" Status="+status[i]);
        }
    }
}
