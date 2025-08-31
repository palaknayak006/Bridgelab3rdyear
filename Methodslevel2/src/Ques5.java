import java.util.Scanner;

public class Ques5 {

    public static double convertYardsToFeet(double y) {
        return y * 3;
    }

    public static double convertFeetToYards(double f) {
        return f * 0.333333;
    }

    public static double convertMetersToInches(double m) {
        return m * 39.3701;
    }

    public static double convertInchesToMeters(double i) {
        return i * 0.0254;
    }

    public static double convertInchesToCm(double i) {
        return i * 2.54;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double y = sc.nextDouble();
            System.out.println("Feet: " + convertYardsToFeet(y));
        }
    }
}
