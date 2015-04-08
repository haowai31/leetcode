/**
 * Created by qinsky31 on 2015/1/29.
 */
public class Solution {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int result = 0;
        int row = obstacleGrid.length;
        if (row==0) {
            return 0;
        }
        int col = obstacleGrid[0].length;
        if (col==0) {
            return 0;
        }
        int[][] ways = new int[row][col];
        if (obstacleGrid[0][0]==0) {
            ways[0][0]=1;
        }
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                if (obstacleGrid[i][j]==0) {
                    if (i != 0) {
                        ways[i][j] += ways[i - 1][j];
                    }
                    if (j != 0) {
                        ways[i][j] += ways[i][j - 1];
                    }
                }
            }
        }
        result = ways[row-1][col-1];

        return result;
    }

    public static void main(String[] args) {
        int[][] obstacleGrid = {
                {0,0,0},
                {0,1,0},
                {0,0,0},
        };
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
}
