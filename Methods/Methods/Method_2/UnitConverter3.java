public class UnitConverter3 {
    public static double convertFarhenheitToCelsius(double f){ return (f-32)*5/9; }
    public static double convertCelsiusToFarhenheit(double c){ return (c*9/5)+32; }
    public static double convertPoundsToKg(double p){ return p*0.453592; }
    public static double convertKgToPounds(double kg){ return kg*2.20462; }
    public static double convertGallonsToLiters(double g){ return g*3.78541; }
    public static double convertLitersToGallons(double l){ return l*0.264172; }
    public static void main(String[] args){
        System.out.println("98F = "+convertFarhenheitToCelsius(98)+" C");
        System.out.println("37C = "+convertCelsiusToFarhenheit(37)+" F");
        System.out.println("100 pounds = "+convertPoundsToKg(100)+" kg");
        System.out.println("50 kg = "+convertKgToPounds(50)+" pounds");
        System.out.println("2 gallons = "+convertGallonsToLiters(2)+" liters");
        System.out.println("10 liters = "+convertLitersToGallons(10)+" gallons");
    }
}
