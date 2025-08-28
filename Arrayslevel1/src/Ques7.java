import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a natural number: ");
            int number = sc.nextInt();

            if (number <= 0) {
                System.out.println("Error: Enter a natural number.");
                return;
            }

            int[] even = new int[number];
            int[] odd = new int[number];
            int eIndex = 0, oIndex = 0;

            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    even[eIndex] = i;
                    eIndex++;
                } else {
                    odd[oIndex] = i;
                    oIndex++;
                }
            }

            System.out.print("Even numbers: ");
            for (int i = 0; i < eIndex; i++) {
                System.out.print(even[i] + " ");
            }

            System.out.print("\nOdd numbers: ");
            for (int i = 0; i < oIndex; i++) {
                System.out.print(odd[i] + " ");
            }
        }
    }
}
