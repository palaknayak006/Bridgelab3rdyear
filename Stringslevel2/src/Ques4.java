import java.util.Scanner;

public class Ques4 {

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

    public static String[] findShortestAndLongest(String[] words) {
        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
            if (word.length() > longest.length()) longest = word;
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.nextLine();
            String[] words = manualSplit(text);
            String[] result = findShortestAndLongest(words);

            System.out.println("Shortest: " + result[0]);
            System.out.println("Longest: " + result[1]);
        }
    }
}
