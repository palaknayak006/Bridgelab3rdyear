import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int count = 0, temp = num;

            while (temp > 0) {
                count++;
                temp /= 10;
            }

            int[] digits = new int[count];

            for (int i = 0; i < count; i++) {
                digits[i] = num % 10;
                num /= 10;
            }

            System.out.print("Reversed Number: ");
            for (int i = 0; i < count; i++) {
                System.out.print(digits[i]);
            }
        }
    }
}
