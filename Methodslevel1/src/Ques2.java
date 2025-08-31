import java.util.Scanner;
public class Ques2 {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();

            int handshakes = calculateHandshakes(n);
            System.out.println("Maximum possible handshakes: " + handshakes);
        }
    }
}
