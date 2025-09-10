import java.util.Scanner;

public class BMICalculator {
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";
        return new String[]{String.valueOf(weight), String.valueOf(heightCm),
                String.format("%.2f", bmi), status};
    }

    public static String[][] processBMI(double[][] arr) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            result[i] = calculateBMI(arr[i][0], arr[i][1]);
        }
        return result;
    }

    public static void display(String[][] result) {
        System.out.println("Weight\tHeight\tBMI\t\tStatus");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            arr[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            arr[i][1] = sc.nextDouble();
        }
        String[][] result = processBMI(arr);
        display(result);
    }
}
