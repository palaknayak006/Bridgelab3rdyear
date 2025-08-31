import java.util.Scanner;

public class Ques9 {

    private static String monthName(int m) {
        String[] names = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return names[m-1];
    }

    private static boolean isLeap(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    private static int daysInMonth(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2 && isLeap(y)) return 29;
        return days[m-1];
    }

    private static int firstDayOfMonth(int m, int y) {
        // Sakamoto's algorithm: 0 = Sunday
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        int yy = y;
        if (m < 3) yy -= 1;
        int day = (yy + yy/4 - yy/100 + yy/400 + t[m-1] + 1) % 7; // day of week for 1st (Sun=0)
        return day;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter month (1-12): ");
            int m = sc.nextInt();
            System.out.print("Enter year (e.g. 2005): ");
            int y = sc.nextInt();
            int days = daysInMonth(m, y);
            int first = firstDayOfMonth(m, y); // 0=Sunday
            System.out.println("\n   " + monthName(m) + " " + y);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");
            for (int i = 0; i < first; i++) System.out.print("    ");
            for (int d = 1; d <= days; d++) {
                System.out.printf("%3d ", d);
                if ((d + first) % 7 == 0) System.out.println();
            }
            System.out.println();
        }
    }
}
