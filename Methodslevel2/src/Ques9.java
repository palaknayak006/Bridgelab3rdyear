import java.util.Scanner;

public class Ques9 {

    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        return a > b ? 1 : (a == b ? 0 : -1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[5];
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
                if (!isPositive(arr[i])) {
                    System.out.println("Negative");
                } else {
                    System.out.println(isEven(arr[i]) ? "Even" : "Odd");
                }
            }
            int res = compare(arr[0], arr[4]);
            System.out.println(res == 0 ? "Equal" : (res > 0 ? "First greater" : "Last greater"));
        }
    }
}
