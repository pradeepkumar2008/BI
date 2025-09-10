import java.util.Scanner;
public class feet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distanceFeet = input.nextDouble();
        double yards = distanceFeet / 3.0;
        double milesDist = yards / 1760.0;
        System.out.println("The distance in yards is " + yards + " and in miles is " + milesDist);
        input.close();
    }
}
