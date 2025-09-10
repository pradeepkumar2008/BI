import java.util.Scanner;
public class area_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;
        System.out.println("The area of triangle in square inches is " + areaInInches + " and in square cm is " + areaInCm);
        input.close();
    }
}
