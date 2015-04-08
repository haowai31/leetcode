/**
 * Created by qinsky31 on 2015/1/29.
 */
public class Solution {
    public static int minPathSum(int[][] grid) {
        int result = 0;
        int row = grid.length;
        if (row==0) {
            return 0;
        }
        int col = grid[0].length;
        int[][] min = new int[row][col];
        for (int i=0;i<row;i++) {
            min[i][0] = grid[i][0];
            if (i>0) {
                min[i][0] += min[i - 1][0];
            }
        }
        for (int i=0;i<col;i++) {
            min[0][i] = grid[0][i];
            if (i>0) {
                min[0][i] += min[0][i-1];
            }
        }

        for (int i=1;i<row;i++) {
            for (int j=1;j<col;j++) {
                min[i][j] = Math.min(min[i-1][j],min[i][j-1]) + grid[i][j];
            }
        }
        result = min[row-1][col-1];

        return result;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1,2,3,4,5,6},
                {1,2,3,4,5,6},
                {1,2,3,4,5,6},
                {1,2,3,4,5,6},
                {1,2,3,4,5,6},
        };
        System.out.println(minPathSum(grid));
    }
}
