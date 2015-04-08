/**
 * Created by qinsky31 on 2015/3/19.
 */
public class Solution {
    public String multiply(String num1, String num2) {
        String result = "";
        int[] result_int = new int[num1.length()+num2.length()];

        for (int i=num2.length()-1;i>=0;i--) {
            int shiwei = 0;
            int count = num2.length() - i - 1;

            for (int j=num1.length()-1;j>=0;j--) {
                int mul1 = num2.charAt(i) - '0';
                int mul2 = num1.charAt(j) - '0';
                int tmp = mul1 * mul2 + shiwei + result_int[count];
                shiwei = tmp / 10;
                int gewei = tmp % 10;
                result_int[count] = gewei;
                count ++;
            }
            if (shiwei!=0) {
                result_int[count] = shiwei;
            }
        }
        for (int i=0;i<result_int.length;i++) {
            result = result_int[i] + result;
        }
        int count = 0;
        while (result.charAt(count)=='0') {
            count ++;
            if (count>=result.length()) {
                return "0";
            }
        }

        result = result.substring(count);

        return result;
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "1";
        Solution solution  = new Solution();
        System.out.println(solution.multiply(num1,num2));
    }
}
