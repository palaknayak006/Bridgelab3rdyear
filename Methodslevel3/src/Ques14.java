import java.util.Scanner;

public class Ques14 {

    public static int[][] randomMatrix(int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) m[i][j] = (int)(Math.random()*10);
        return m;
    }

    public static int[][] add(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    public static int[][] subtract(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int r = a.length, common = a[0].length, c = b[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int sum = 0;
                for (int k = 0; k < common; k++) sum += a[i][k] * b[k][j];
                res[i][j] = sum;
            }
        }
        return res;
    }

    public static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Rows for A: ");
            int r = sc.nextInt();
            System.out.print("Cols for A (and rows for B): ");
            int c = sc.nextInt();
            System.out.print("Cols for B: ");
            int c2 = sc.nextInt();
            int[][] A = randomMatrix(r, c);
            int[][] B = randomMatrix(c, c2);
            System.out.println("Matrix A:");
            printMatrix(A);
            System.out.println("Matrix B:");
            printMatrix(B);
            System.out.println("A+B (only if same dims, showing A and B square case):");
            if (r == c && c == c2) printMatrix(add(A, B));
            else System.out.println("Add not available for given dims");
            System.out.println("A*B:");
            printMatrix(multiply(A, B));
        }
    }
}
