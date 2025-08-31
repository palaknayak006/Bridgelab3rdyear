import java.util.Scanner;

public class Ques10 {

    public static boolean collinearBySlope(double x1,double y1,double x2,double y2,double x3,double y3) {
        double dx1 = x2 - x1;
        double dx2 = x3 - x2;
        if (dx1 == 0 && dx2 == 0) return true;
        if (dx1 == 0 || dx2 == 0) return false;
        double s1 = (y2 - y1) / dx1;
        double s2 = (y3 - y2) / dx2;
        return Math.abs(s1 - s2) < 1e-9;
    }

    public static boolean collinearByArea(double x1,double y1,double x2,double y2,double x3,double y3) {
        double area2 = x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2); // 2*area
        return Math.abs(area2) < 1e-9;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter x1 y1: ");
            double x1 = sc.nextDouble(), y1 = sc.nextDouble();
            System.out.print("Enter x2 y2: ");
            double x2 = sc.nextDouble(), y2 = sc.nextDouble();
            System.out.print("Enter x3 y3: ");
            double x3 = sc.nextDouble(), y3 = sc.nextDouble();
            System.out.println("Collinear by slope? " + collinearBySlope(x1,y1,x2,y2,x3,y3));
            System.out.println("Collinear by area?  " + collinearByArea(x1,y1,x2,y2,x3,y3));
        }
    }
}
