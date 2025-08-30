import java.util.Scanner;

public class Ques7 {
    public static int[] trimIndices(String str) {
        int start = 0, end = str.length() - 1;
        while (start < str.length() && str.charAt(start) == ' ') start++;
        while (end >= 0 && str.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    public static String substring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.nextLine();
            int[] idx = trimIndices(text);
            String customTrim = substring(text, idx[0], idx[1]);
            String builtinTrim = text.trim();
            System.out.println("Custom Trim: [" + customTrim + "]");
            System.out.println("Built-in Trim: [" + builtinTrim + "]");
            System.out.println("Equal? " + compareStrings(customTrim, builtinTrim));
        }
    }
}
