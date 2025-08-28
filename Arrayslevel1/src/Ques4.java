import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[] arr = new double[10];
            double total = 0.0;
            int index = 0;

            while (true) {
                System.out.print("Enter a number (0 or negative to stop): ");
                double num = sc.nextDouble();

                if (num <= 0 || index == 10) break;
                arr[index++] = num;
            }

            System.out.println("Numbers entered:");
            for (int i = 0; i < index; i++) {
                System.out.print(arr[i] + " ");
                total += arr[i];
            }
            System.out.println("\nSum = " + total);
        }
    }
}

