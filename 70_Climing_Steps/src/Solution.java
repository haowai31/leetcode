/**
 * Created by qinsky31 on 2015/1/27.
 */
public class Solution {
    public static int climbStairs(int n) {
        int result = 0;
        if (n<1) {
            return 0;
        }
        if (n==1) {
            return 1;
        }
        if (n==2) {
            return 2;
        }
        int[] h = new int[n + 1];
        h[1] = 1;
        h[2] = 2;
        for (int i=3;i<=n;i++){
            h[i] = h[i-1] + h[i-2];
        }
        result = h[n];
        return result;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(climbStairs(n));
    }
}
