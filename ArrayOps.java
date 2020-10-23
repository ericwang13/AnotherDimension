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

    public static int[] sumCols(int[][] matrix) {
        int[] totals = new int[matrix[0].length];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j ++) {
                totals[i] += matrix[j][i];
            }
        }

        return totals;
    }

    public static boolean isRowMagic(int[][] matrix) {
        int[] totals = sumRows(matrix);
        int rowTotal = totals[0];

        for (int i : totals) {
            if (rowTotal != i) {
                return false;
            }
        }

        return true;
    }
    
    public static boolean isColMagic(int[][] matrix) {
        int[] totals = sumCols(matrix);
        int colTotal = totals[0];

        for (int i : totals) {
            if (colTotal != i) {
                return false;
            }
        }

        return true;    
    }

    public static boolean isLocationMagic(int[][] matrix, int row, int col) {
        int[] rowTotals = sumRows(matrix);
        int[] colTotals = sumCols(matrix);

        return rowTotals[row] == colTotals[col];
    }
}