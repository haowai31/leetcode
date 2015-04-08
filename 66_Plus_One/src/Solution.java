/**
 * Created by qinsky31 on 2015/1/27.
 */
public class Solution {
    public static int[] plusOne(int[] digits) {
        int[] result;
        int flag = 0;
        digits[digits.length-1] += 1;
        if (digits[digits.length-1]>9) {
            digits[digits.length-1] -= 10;
            flag = 1;
        }else {
            result = digits;
            return result;
        }
        for (int i=digits.length-2;i>=0;i--) {
            digits[i] += 1;
            if (digits[i]>9) {
                digits[i] -= 10;
            }else {
                flag = 0;
                break;
            }
        }

        if (flag == 1) {
            result = new int[digits.length + 1];
            for (int i=digits.length-1;i>=0;i--) {
                result[i + 1] = digits[i];
                result[0] = 1;
            }
        }else {
            result = digits;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1,9,9,9,8};
        int[] result = plusOne(digits);
        for (int i=0;i<result.length;i++) {
            System.out.println(result[i]);
        }

    }
}
