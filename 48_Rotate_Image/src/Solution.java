/**
 * Created by qinsky31 on 2015/3/19.
 */
public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i=0;i<n/2;i++) {
            for (int j=i;j<n-i-1;j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = tmp;
            }
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        solution.rotate(matrix);
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix.length;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
