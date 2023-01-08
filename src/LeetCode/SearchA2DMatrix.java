package LeetCode;

/**
 * @Description: Write an efficient algorithm that searches for a value target in an m x n integer matrix.
 * This matrix has the following properties:
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * @author: Wei Liang
 * @date: 2022年12月23日 3:31 PM
 */
public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int[][] matrix1 = {
                {1},
                {3}
        };
        boolean t = searchMatrix(matrix1,1);
        System.out.println(t);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;
        int mid = Integer.MIN_VALUE;
        if ((target > matrix[matrix.length - 1][matrix[0].length - 1] && target < matrix[0][0])) {
            return false;
        }
        int isSame = Integer.MAX_VALUE;  //to determine is it stuck at same row
        while (high >= low && isSame!=mid) {
            isSame = mid;
            mid = (low + high+1) >>> 1;  // plus one means to determine the {{1},{3}}, target 3 will output false case. because +1 will to choose 2nd mid number
            if (target < matrix[mid][0]) {
                high = mid - 1;
            } else if (target > matrix[mid][0]) {
                low = mid;
            } else {
                return true;
            }
        }
        low = 0;
        high = matrix[0].length - 1;
        int newMid = 0;
        while (low <= high) {
            newMid = (low + high+1) >>> 1;
            if (target < matrix[mid][newMid]) {
                high = newMid - 1;
            } else if (target > matrix[mid][newMid]) {
                low = newMid+1;
            } else {
                return true;
            }
        }
        return false;
    }
}
