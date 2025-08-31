import java.util.Scanner;

public class Ques2 {

    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] digits(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static boolean isDuck(int[] arr) {
        for (int d : arr) if (d == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int n, int[] arr) {
        int p = arr.length, sum = 0;
        for (int d : arr) sum += Math.pow(d, p);
        return sum == n;
    }

    public static void largestSmallest(int[] arr) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int d : arr) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        System.out.println("Largest: " + largest + ", Second Largest: " + secondLargest);
        System.out.println("Smallest: " + smallest + ", Second Smallest: " + secondSmallest);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = digits(n);
            System.out.println("Duck: " + isDuck(arr));
            System.out.println("Armstrong: " + isArmstrong(n, arr));
            largestSmallest(arr);
        }
    }
}
