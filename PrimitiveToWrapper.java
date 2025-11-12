import java.util.Scanner;

public class PrimitiveToWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int primitiveInt = scanner.nextInt(); 

        Integer wrapperInt = primitiveInt;

        System.out.println("Primitive value: " + primitiveInt);
        System.out.println("Wrapper object value: " + wrapperInt);
    }
}