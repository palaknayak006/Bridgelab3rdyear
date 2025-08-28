import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a positive number: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Error: Enter a positive integer.");
                return;
            }

            String[] results = new String[n + 1];

            for (int i = 0; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                    results[i] = "FizzBuzz";
                } else if (i % 3 == 0 && i != 0) {
                    results[i] = "Fizz";
                } else if (i % 5 == 0 && i != 0) {
                    results[i] = "Buzz";
                } else {
                    results[i] = String.valueOf(i);
                }
            }

            for (int i = 0; i <= n; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }
        }
    }
}
