import java.util.Scanner;

public class Ques3 {

    public static int[] digits(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static int sumDigits(int[] arr) {
        int sum = 0;
        for (int d : arr) sum += d;
        return sum;
    }

    public static int sumSquares(int[] arr) {
        int sum = 0;
        for (int d : arr) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int n, int[] arr) {
        return n % sumDigits(arr) == 0;
    }

    public static void frequency(int[] arr) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int d : arr) freq[d][1]++;
        for (int i = 0; i < 10; i++) if (freq[i][1] > 0)
            System.out.println(freq[i][0] + " occurs " + freq[i][1] + " times");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = digits(n);
            System.out.println("Sum of digits: " + sumDigits(arr));
            System.out.println("Sum of squares: " + sumSquares(arr));
            System.out.println("Harshad: " + isHarshad(n, arr));
            frequency(arr);
        }
    }
}
