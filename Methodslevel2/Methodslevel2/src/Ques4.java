import java.util.Scanner;

public class Ques4 {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double m) {
        return m * 1.60934;
    }

    public static double convertMetersToFeet(double m) {
        return m * 3.28084;
    }

    public static double convertFeetToMeters(double f) {
        return f * 0.3048;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double km = sc.nextDouble();
            System.out.println("Miles: " + convertKmToMiles(km));
        }
    }
}
