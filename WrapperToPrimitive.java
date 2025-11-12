public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double wrapperDouble = 45.67;

        double primitiveDouble = wrapperDouble; 
        int primitiveInt = wrapperDouble.intValue(); 

        System.out.println("Wrapper Double: " + wrapperDouble); 
        System.out.println("Primitive double: " + primitiveDouble); 
        System.out.println("Primitive int: " + primitiveInt); 
    }
}