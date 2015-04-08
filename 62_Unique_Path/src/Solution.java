/**
 * Created by qinsky31 on 2015/1/29.
 */
public class Solution {
    public static int uniquePaths(int m, int n) {
        int result = 0;
        int[][] ways = new int[m][n];
        if (m==0 || n==0) {
            return 0;
        }
        ways[0][0]=1;
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (i!=0) {
                    ways[i][j] += ways[i-1][j];
                }
                if (j!=0) {
                    ways[i][j] += ways[i][j-1];
                }
            }
        }
        result = ways[m-1][n-1];
        return  result;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        System.out.println(uniquePaths(m,n));
    }
}
