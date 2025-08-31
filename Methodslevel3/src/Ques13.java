import java.util.Scanner;

public class Ques13 {

    public static int[][] generateScores(int n) {
        int[][] s = new int[n][3];
        for (int i = 0; i < n; i++) {
            s[i][0] = (int)(Math.random() * 90) + 10; // Physics 10-99
            s[i][1] = (int)(Math.random() * 90) + 10; // Chemistry
            s[i][2] = (int)(Math.random() * 90) + 10; // Maths
        }
        return s;
    }

    public static double[][] totalsAvgPercent(int[][] scores) {
        int n = scores.length;
        double[][] res = new double[n][3];
        for (int i = 0; i < n; i++) {
            int sum = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = sum / 3.0;
            double percent = (sum / 300.0) * 100.0;
            res[i][0] = sum;
            res[i][1] = Math.round(avg * 100.0) / 100.0;
            res[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return res;
    }

    public static void display(int[][] scores, double[][] stat) {
        System.out.println("Idx\tPhy\tChem\tMath\tTotal\tAvg\tPercent");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f%n",
                    i+1, scores[i][0], scores[i][1], scores[i][2], stat[i][0], stat[i][1], stat[i][2]);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            int[][] scores = generateScores(n);
            double[][] stat = totalsAvgPercent(scores);
            display(scores, stat);
        }
    }
}

