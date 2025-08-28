import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            double[] salary = new double[10];
            double[] years = new double[10];
            double[] bonus = new double[10];
            double[] newSalary = new double[10];

            double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

            for (int i = 0; i < 10; i++) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salary[i] = sc.nextDouble();

                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                years[i] = sc.nextDouble();
            }

            for (int i = 0; i < 10; i++) {
                if (years[i] > 5) {
                    bonus[i] = 0.05 * salary[i];
                } else {
                    bonus[i] = 0.02 * salary[i];
                }

                newSalary[i] = salary[i] + bonus[i];

                totalBonus += bonus[i];
                totalOldSalary += salary[i];
                totalNewSalary += newSalary[i];
            }

            System.out.println("Total old salary: " + totalOldSalary);
            System.out.println("Total bonus payout: " + totalBonus);
            System.out.println("Total new salary: " + totalNewSalary);
        }
    }
}
