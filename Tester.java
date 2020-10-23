import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        // Test sum(int[] arr)
        System.out.println(ArrayOps.sum(new int[] { 13, 7, 17 }));

        // Test largest(int[] arr)
        System.out.println(ArrayOps.largest(new int[] { 13, 7, 17 }));

        // Test sumRows(int[][] matrix)
        System.out.println(
                Arrays.toString(ArrayOps.sumRows(new int[][] { { 13, 7, 17 }, { 1, 9, 8, 9 }, { 22, 15 }, { 1, 8 } })));

        // Test largestInRows(int[][] matrix)
        System.out.println(Arrays
                .toString(ArrayOps.largestInRows(new int[][] { { 13, 7, 17 }, { 1, 9, 8, 9 }, { 22, 15 }, { 1, 8 } })));

        // Test sum(int[][] arr)
        System.out.println((ArrayOps.sum(new int[][] { { 13, 7, 17 }, { 1, 9, 8, 9 }, { 22, 15 }, { 1, 8 } })));
    }
}