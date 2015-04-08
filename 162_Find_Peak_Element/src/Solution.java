/**
 * Created by qinsky31 on 2015/1/27.
 */
public class Solution {
    public static int findPeakElement(int[] num) {
        int result = num.length-1;
        for (int i=1;i<num.length;i++) {
            if (num[i]<num[i-1]) {
                return i-1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,1};
        System.out.println(findPeakElement(num));
    }
}
