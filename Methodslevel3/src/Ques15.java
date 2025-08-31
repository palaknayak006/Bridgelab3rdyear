import java.util.Scanner;

public class Ques15 {

    public static double[][] transpose(double[][] m) {
        int r = m.length, c = m[0].length;
        double[][] t = new double[c][r];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) t[j][i] = m[i][j];
        return t;
    }

    public static double det2(double[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    public static double det3(double[][] m) {
        double a = m[0][0], b = m[0][1], c = m[0][2];
        double d = m[1][0], e = m[1][1], f = m[1][2];
        double g = m[2][0], h = m[2][1], i = m[2][2];
        return a*(e*i - f*h) - b*(d*i - f*g) + c*(d*h - e*g);
    }

    public static double[][] inverse2(double[][] m) {
        double det = det2(m);
        if (Math.abs(det) < 1e-12) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1]/det;
        inv[0][1] = -m[0][1]/det;
        inv[1][0] = -m[1][0]/det;
        inv[1][1] = m[0][0]/det;
        return inv;
    }

    public static double[][] inverse3(double[][] m) {
        double det = det3(m);
        if (Math.abs(det) < 1e-12) return null;
        double[][] adj = new double[3][3];
        adj[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]);
        adj[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        adj[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]);
        adj[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        adj[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]);
        adj[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);
        adj[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
        adj[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);
        adj[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]);
        double[][] inv = new double[3][3];
        for (int r = 0; r < 3; r++) for (int c = 0; c < 3; c++) inv[r][c] = adj[c][r] / det;
        return inv;
    }

    public static void printMatrix(double[][] m) {
        for (double[] row : m) {
            for (double x : row) System.out.printf("%.4f\t", x);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size (2 or 3): ");
            int n = sc.nextInt();
            double[][] m = new double[n][n];
            System.out.println("Enter matrix elements row-wise:");
            for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) m[i][j] = sc.nextDouble();
            System.out.println("Transpose:");
            printMatrix(transpose(m));
            if (n == 2) {
                System.out.println("Determinant: " + det2(m));
                double[][] inv = inverse2(m);
                if (inv == null) System.out.println("No inverse (det=0)");
                else { System.out.println("Inverse:"); printMatrix(inv); }
            } else if (n == 3) {
                System.out.println("Determinant: " + det3(m));
                double[][] inv = inverse3(m);
                if (inv == null) System.out.println("No inverse (det=0)");
                else { System.out.println("Inverse:"); printMatrix(inv); }
            } else {
                System.out.println("Unsupported size");
            }
        }
    }
}
