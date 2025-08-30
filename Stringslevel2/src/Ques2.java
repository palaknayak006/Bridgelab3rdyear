import java.util.Scanner;

public class Ques2 {

    public static String[] manualSplit(String str) {
        int wordCount = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // fixed
            if (ch == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        int wordIndex = 0, start = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // fixed
            if (ch == ' ') {
                words[wordIndex++] = str.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = str.substring(start);
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.nextLine();
            String[] arr1 = manualSplit(text);
            String[] arr2 = text.split(" ");
            System.out.println("Manual split = " + String.join(",", arr1));
            System.out.println("Built-in split = " + String.join(",", arr2));
            System.out.println("Are they same? " + compareArrays(arr1, arr2));
        }
    }
}
