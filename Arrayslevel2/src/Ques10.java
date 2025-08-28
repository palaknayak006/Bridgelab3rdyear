import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a large number: ");
            String num = sc.next();

            int[] freq = new int[10];

            for (int i = 0; i < num.length(); i++) {
                char c = num.charAt(i);
                if (Character.isDigit(c)) {
                    freq[c - '0']++;
                }
            }

            System.out.println("Digit Frequency:");
            for (int i = 0; i < 10; i++) {
                if (freq[i] > 0) {
                    System.out.println(i + " -> " + freq[i]);
                }
            }
        }
    }
}
