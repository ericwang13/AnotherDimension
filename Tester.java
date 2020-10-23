import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        // Test sum(int[] arr)
        System.out.println("sum(int[] arr):\n " +
                ArrayOps.sum(new int[] { 13, 7, 17 }));

        // Test largest(int[] arr)
        System.out.println("largest(int[] arr):\n " +
                ArrayOps.largest(new int[] { 13, 7, 17 }));

        // Test sumRows(int[][] matrix)
        System.out.println("sumRows(int[][] matrix):\n " +
                Arrays.toString(ArrayOps.sumRows(new int[][] { { 13, 7, 17 }, { 1, 9, 8, 9 }, { 22, 15 }, { 1, 8 } })));

        // Test largestInRows(int[][] matrix)
        System.out.println("largestInRows(int[][] matrix):\n " +
                Arrays.toString(ArrayOps.largestInRows(new int[][] { { 13, 7, 17 }, { 1, 9, 8, 9 }, { 22, 15 }, { 1, 8 } })));

        // Test sum(int[][] arr)
        System.out.println("sum(int[][] arr):\n " +
                (ArrayOps.sum(new int[][] { { 13, 7, 17 }, { 1, 9, 8, 9 }, { 22, 15 }, { 1, 8 } })));

        // Test sumCols(int[][] matrix)
        System.out.println("sumCols(int[][] matrix):\n " +
                Arrays.toString(ArrayOps.sumCols(new int[][] { { 13, 7, 17, 12 }, { 1, 9, 8, 9 }, { 22, 15, 1, 8 } })));

        // Test isRowMagic(int[][] matrix)
        System.out.println("isRowMagic(int[][] matrix):\n " +
                ArrayOps.isRowMagic(new int[][] { { 13, 7, 17 }, { 1, 9, 8, 9 }, { 22, 15 }, { 1, 8 } }));
        System.out.println(" " +
                ArrayOps.isRowMagic(new int[][] { { 13, 7, 17 }, { 7, 17, 13 }, { 30, 7 }, { 37 } }));

        // Test isColMagic(int[][] matrix)
        System.out.println("isColMagic(int[][] matrix):\n " +
                ArrayOps.isColMagic(new int[][] { { 13, 7, 17 }, { 1, 9, 8, 9 }, { 22, 15 }, { 1, 8 } }));

        // Test isLocationMagic(int[][] matrix, int row, int col)
        System.out.println("isLocationMagic(int[][] matrix, int row, int col):\n " +
                ArrayOps.isLocationMagic(new int[][] { { 13, 7, 17 }, { 1, 9, 8, 9 }, { 22, 15 }, { 1, 8 } }, 13, 7));
    }
}