/**
 * Created by qinsky31 on 2015/1/27.
 */
public class Solution {
    public static int findMin(int[] num) {
        int l = 0;
        int r = num.length - 1;
        while (l<r) {
            int mid = (l + r) /2;
            if (num[mid]<num[num.length-1]) {
                r = mid;
            }else {
                l = mid + 1;
            }
        }
        return num[l];
    }

    public static void main(String[] args) {
        int[] num = {4,5,6,7,1,3};
        System.out.print(findMin(num));
    }
}
