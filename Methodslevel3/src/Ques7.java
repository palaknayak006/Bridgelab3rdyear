import java.util.Scanner;

public class Ques7 {

    public static int[] factors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] f = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) f[idx++] = i;
        return f;
    }

    public static int greatestFactor(int[] f, int n) {
        for (int i = f.length - 1; i >= 0; i--) if (f[i] != n) return f[i];
        return 1;
    }

    public static int sumFactors(int[] f) {
        int s = 0;
        for (int x : f) s += x;
        return s;
    }

    public static long productFactors(int[] f) {
        long p = 1;
        for (int x : f) p *= x;
        return p;
    }

    public static double productCubes(int[] f) {
        double p = 1;
        for (int x : f) p *= Math.pow(x, 3);
        return p;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            int n = sc.nextInt();
            int[] f = factors(n);
            System.out.print("Factors: ");
            for (int x : f) System.out.print(x + " ");
            System.out.println();
            System.out.println("Greatest proper factor: " + greatestFactor(f, n));
            System.out.println("Sum of factors: " + sumFactors(f));
            System.out.println("Product of factors: " + productFactors(f));
            System.out.println("Product of cubes of factors: " + productCubes(f));
        }
    }
}
