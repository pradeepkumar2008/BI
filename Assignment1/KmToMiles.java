import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double k = sc.nextDouble();
        double miles = k * 0.621371;
        System.out.println(miles);
    }
}
