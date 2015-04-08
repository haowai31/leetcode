/**
 * Created by qinsky31 on 2015/2/4.
 */
public class Solution {
    public static int searchInsert(int[] A, int target) {
        int result = 0;
        int count = 0;
        if (target<A[0]) {
            return 0;
        }
        while (count<A.length) {
            if (A[count]==target) {
                return count;
            }else if (count<A.length-1) {
                if (A[count]<target && A[count+1]>target) {
                    return (count+1);
                }
            } else {
                return count+1;
            }
            count++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(A,target));
    }
}
