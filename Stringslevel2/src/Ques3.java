import java.util.Scanner;

public class Ques3 {

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

    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.nextLine();
            String[] words = manualSplit(text);
            String[][] table = wordWithLength(words);

            System.out.println("Word\tLength");
            for (String[] row : table) {
                System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
            }
        }
    }
}
