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
        int[] totals = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            totals[i] = sum(matrix[i]);
        }

        return totals;
    }

    public static int[] largestInRows(int[][] matrix) {
        int[] maxes = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            maxes[i] = largest(matrix[i]);
        }

        return maxes;
    }

    public static int sum(int[][] arr) {
        int total = 0;

        for (int[] i : arr) {
            for (int j : i) {
                total += j;
            }
        }

        return total;
    }
}