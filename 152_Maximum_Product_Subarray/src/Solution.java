/**
 * Created by qinsky31 on 2015/1/28.
 */
public class Solution {
    public static int maxProduct(int[] A) {
        int result = Integer.MIN_VALUE;
        int[] max = new int[A.length];
        int[] min = new int[A.length];
        if  (A.length==0) {
            return 0;
        }
        max[0] = A[0];
        min[0] = A[0];
        for (int i=1;i<A.length;i++) {
            max[i] = Math.max(Math.max(max[i-1]*A[i], A[i]),min[i-1]*A[i]);
            min[i] = Math.min(Math.min(max[i - 1] * A[i], A[i]), min[i - 1] * A[i]);
        }
        for (int i=0;i<A.length;i++) {
            if (result<max[i]) {
                result = max[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {2,3,-1,-2, 4,-7};
        System.out.println(maxProduct(A));
    }
}
