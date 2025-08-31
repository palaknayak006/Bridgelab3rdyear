import java.util.Scanner;

public class Ques12 {

    public static double distance(double x1,double y1,double x2,double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] lineEquation(double x1,double y1,double x2,double y2) {
        if (Math.abs(x2 - x1) < 1e-12) return null; // vertical line -> no slope/intercept
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter x1 y1: ");
            double x1 = sc.nextDouble(), y1 = sc.nextDouble();
            System.out.print("Enter x2 y2: ");
            double x2 = sc.nextDouble(), y2 = sc.nextDouble();
            System.out.println("Distance: " + distance(x1,y1,x2,y2));
            double[] eq = lineEquation(x1,y1,x2,y2);
            if (eq == null) System.out.println("Line is vertical: x = " + x1);
            else System.out.println("Line: y = " + eq[0] + "x + " + eq[1]);
        }
    }
}
