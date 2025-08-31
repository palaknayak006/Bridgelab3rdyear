import java.util.Scanner;

public class Ques1 {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int sum(int[] factors) {
        int s = 0;
        for (int f : factors) s += f;
        return s;
    }

    public static int sumSq(int[] factors) {
        int s = 0;
        for (int f : factors) s += Math.pow(f, 2);
        return s;
    }

    public static long product(int[] factors) {
        long p = 1;
        for (int f : factors) p *= f;
        return p;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] f = findFactors(n);

            for (int x : f) System.out.print(x + " ");
            System.out.println();

            System.out.println("Sum: " + sum(f));
            System.out.println("Sum of squares: " + sumSq(f));
            System.out.println("Product: " + product(f));
        }
    }
}
