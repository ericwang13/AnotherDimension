public class ArrayOps {

    public static int sum(int[] arr) {
        int total = 0;

        for (int i : arr) {
            total += i;
        }

        return total;
    }

    public static int largest(int[] arr) {
        int max = arr[0];

        for (int i : arr) {
            if (i > max)
                max = i;
        }

        return max;
    }

    public static int[] sumRows(int[][] matrix) {
        return new int[0];
    }

    public static int[] largestInRows(int[][] matrix) {
        return new int[0];
    }

    public static int sum(int[][] arr) {
        return 0;
    }
}