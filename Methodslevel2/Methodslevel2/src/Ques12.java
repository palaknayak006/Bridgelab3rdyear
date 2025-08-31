public class Ques12 {

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 9000) + 1000;
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] arr) {
        int min = arr[0], max = arr[0], sum = 0;
        for (int n : arr) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return new double[]{sum * 1.0 / arr.length, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
        double[] res = findAverageMinMax(arr);
        System.out.println("Average: " + res[0]);
        System.out.println("Min: " + res[1]);
        System.out.println("Max: " + res[2]);
    }
}
