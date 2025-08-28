import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();

            int[] marks = new int[n];
            char[] grade = new char[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter marks of student " + (i + 1) + ": ");
                marks[i] = sc.nextInt();

                if (marks[i] >= 90) {
                    grade[i] = 'A';
                } else if (marks[i] >= 75) {
                    grade[i] = 'B';
                } else if (marks[i] >= 50) {
                    grade[i] = 'C';
                } else {
                    grade[i] = 'F';
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.println("Marks: " + marks[i] + " Grade: " + grade[i]);
            }
        }
    }
}
