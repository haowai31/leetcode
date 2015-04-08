import java.util.HashMap;

/**
 * Created by qinsky31 on 2015/1/27.
 */
public class Solution {
    public static String fractionToDecimal(int numerator, int denominator) {
        String result = "";
        if ((numerator<0 && denominator>0) || (numerator>0 && denominator<0)) {
            result += '-';
        }
        long num1 = Math.abs((long)numerator);
        long num2 = Math.abs((long)denominator);
        long res = num1/num2;
        long rem = num1 % num2;
        result += String.valueOf(res);
        if (rem==0) {
            return result;
        }

        HashMap<Long ,Integer> map = new HashMap<Long, Integer>();
        result += '.';
        while (rem!=0) {
            if (map.containsKey(rem)) {
                int beg = map.get(rem);
                String part1 = result.substring(0,beg);
                String part2 = result.substring(beg,result.length());
                result = part1 + '(' + part2 +')';
                return result;
            }
            map.put(rem, result.length());
            rem = rem * 10;
            res = rem / num2;
            result += String.valueOf(res);
            rem = rem % num2;
        }
        return result;
    }

    public static void main(String[] args) {
        int numerator = -1;
        int denominator = -2147483648;
        System.out.println(fractionToDecimal(numerator, denominator));
    }
}
