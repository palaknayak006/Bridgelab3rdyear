import java.util.Scanner;

public class Ques6 {
    public static int sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            int sum = sumNaturalNumbers(n);
            System.out.println("Sum of first " + n + " natural numbers is " + sum);
        }
    }
}
