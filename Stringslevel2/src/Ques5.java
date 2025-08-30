import java.util.Scanner;

public class Ques5 {
    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) >= 0) return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }

    public static int[] findCounts(String str) {
        int[] counts = new int[2];
        for (int i = 0; i < str.length(); i++) {
            String type = checkCharType(str.charAt(i));
            if (type.equals("Vowel")) counts[0]++;
            else if (type.equals("Consonant")) counts[1]++;
        }
        return counts;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.nextLine();
            int[] res = findCounts(text);
            System.out.println("Vowels: " + res[0] + ", Consonants: " + res[1]);
        }
    }
}

