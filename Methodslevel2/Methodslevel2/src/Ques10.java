import java.util.Scanner;

public class Ques10 {

    public static double calcBMI(double w, double h) {
        double m = h / 100;
        return w / (m * m);
    }

    public static String status(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[][] data = new double[10][3];
            for (int i = 0; i < 10; i++) {
                double w = sc.nextDouble();
                double h = sc.nextDouble();
                double bmi = calcBMI(w, h);
                data[i][0] = w;
                data[i][1] = h;
                data[i][2] = bmi;
                System.out.println(w + " " + h + " " + bmi + " " + status(bmi));
            }
        }
    }
}
