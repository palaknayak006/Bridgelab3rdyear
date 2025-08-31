import java.util.Arrays;
import java.util.Scanner;

public class Ques4 {

    public static int[] digits(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static int[] reverse(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    public static boolean isPalindrome(int[] arr) {
        return Arrays.equals(arr, reverse(arr));
    }

    public static boolean isDuck(int[] arr) {
        for (int d : arr) if (d == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = digits(n);
            System.out.println("Palindrome: " + isPalindrome(arr));
            System.out.println("Duck: " + isDuck(arr));
            System.out.println("Reversed array: " + Arrays.toString(reverse(arr)));
        }
    }
}
