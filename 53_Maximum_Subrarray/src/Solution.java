/**
 * Created by qinsky31 on 2015/1/28.
 */
public class Solution {
    public static int maxSubArray(int[] A) {
        int result = Integer.MIN_VALUE;
        int[] max = new int[A.length];
        if (A.length==0) {
            return 0;
        }
        max[0] = A[0];
        for (int i=1;i<A.length;i++) {
            max[i] = Math.max(max[i-1]+A[i],A[i]);
        }
        for (int i=0;i<A.length;i++) {
            if (result<max[i]) {
                result = max[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(A));
    }
}
