public class Ques11 {

    public static int[][] generateEmployees() {
        int[][] data = new int[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000; // 5-digit salary 10000-99999
            data[i][1] = (int) (Math.random() * 11); // years 0-10
        }
        return data;
    }

    public static double[][] computeNewSalaryAndBonus(int[][] data) {
        double[][] res = new double[10][2]; // [i][0]=newSalary, [i][1]=bonus
        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            int years = data[i][1];
            double rate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * rate;
            double newSalary = salary + bonus;
            res[i][0] = newSalary;
            res[i][1] = bonus;
        }
        return res;
    }

    public static void summary(int[][] oldData, double[][] newData) {
        double sumOld = 0, sumNew = 0, sumBonus = 0;
        System.out.println("Idx\tOldSalary\tYears\tNewSalary\tBonus");
        for (int i = 0; i < 10; i++) {
            int oldSal = oldData[i][0], yrs = oldData[i][1];
            double newSal = newData[i][0], bonus = newData[i][1];
            sumOld += oldSal;
            sumNew += newSal;
            sumBonus += bonus;
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%.2f%n", i+1, oldSal, yrs, newSal, bonus);
        }
        System.out.printf("Totals:\t%.2f\t\t\t%.2f\t\t%.2f%n", sumOld, sumNew, sumBonus);
    }

    public static void main(String[] args) {
        
            int[][] employees = generateEmployees();
            double[][] newData = computeNewSalaryAndBonus(employees);
            summary(employees, newData);
        
    }
}
