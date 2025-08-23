import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            int n = sc.nextInt();

            if (n >= 0) {
                long fact = 1;
                for (int i = 1; i <= n; i++) {
                    fact *= i;
                }
                System.out.println("Factorial of " + n + " is " + fact);
            } else {
                System.out.println("Invalid input! Please enter a natural number.");
            }
        }
    }
}

