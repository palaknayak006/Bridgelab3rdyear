import java.util.Scanner;

public class Ques11 {

    public static double[] roots(int a, int b, int c) {
        double d = b * b - 4 * a * c;
        if (d < 0) return new double[]{};
        if (d == 0) return new double[]{-b / (2.0 * a)};
        double r1 = (-b + Math.sqrt(d)) / (2 * a);
        double r2 = (-b - Math.sqrt(d)) / (2 * a);
        return new double[]{r1, r2};
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            double[] r = roots(a, b, c);
            for (double x : r) System.out.println(x);
        }
    }
}
