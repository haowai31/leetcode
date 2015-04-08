/**
 * Created by qinsky31 on 2015/2/3.
 */
public class Solution {
    public static void nextPermutation(int[] num) {
        if (num.length<2) {
            return;
        }
        if (num[num.length-1]>num[num.length-2]) {
            int tmp = num[num.length-1];
            num[num.length-1] = num[num.length-2];
            num[num.length-2] = tmp;
            return;
        }
        int point = num.length-1;
        while (point>=1 && num[point]<=num[point-1]) {
            point--;
        }
        if (point == 0) {
            for (int i=0;i<num.length/2;i++) {
                int tmp = num[i];
                num[i] = num[num.length-i-1];
                num[num.length-i-1] = tmp;
            }
        }else {
            int min = Integer.MAX_VALUE;
            int count = 0;
            for (int i=point;i<num.length;i++) {
                if (min >= num[i] && num[i] > num[point-1]) {
                    min = num[i];
                    count = i;
                }
            }
            int tmp = num[point-1];
            num[point-1] = num[count];
            num[count] = tmp;
            for (int i=point;i<(num.length+point)/2;i++) {
                tmp = num[i];
                num[i] = num[num.length+point-i-1];
                num[num.length+point-i-1] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {2,3,1,3,3};
        nextPermutation(num);
        for (int i=0;i<num.length;i++) {
            System.out.print(num[i]);
            System.out.print(" ");
        }
    }
}
