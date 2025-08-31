import java.util.Scanner;

public class Ques8 {

    public static int youngest(int[] ages) {
        int min = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[min]) min = i;
        }
        return min;
    }

    public static int tallest(int[] heights) {
        int max = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[max]) max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] age = new int[3];
            int[] ht = new int[3];
            for (int i = 0; i < 3; i++) age[i] = sc.nextInt();
            for (int i = 0; i < 3; i++) ht[i] = sc.nextInt();
            System.out.println("Youngest index: " + youngest(age));
            System.out.println("Tallest index: " + tallest(ht));
        }
    }
}
