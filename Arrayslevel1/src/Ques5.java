import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter limit for multiplication: ");
            int num = sc.nextInt();

            for (int i = 6; i <= 9; i++) {
                System.out.println("Table of " + i + ":");
                for (int j = 1; j <= num; j++) {
                    System.out.println(i + " * " + j + " = " + (i * j));
                }
                System.out.println();
            }
        }
    }
}
