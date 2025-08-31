import java.util.Scanner;

public class Ques6 {

    public static double convertFarhenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCelsiusToFarhenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double convertPoundsToKg(double p) {
        return p * 0.453592;
    }

    public static double convertKgToPounds(double k) {
        return k * 2.20462;
    }

    public static double convertGallonsToLiters(double g) {
        return g * 3.78541;
    }

    public static double convertLitersToGallons(double l) {
        return l * 0.264172;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double f = sc.nextDouble();
            System.out.println("Celsius: " + convertFarhenheitToCelsius(f));
        }
    }
}
