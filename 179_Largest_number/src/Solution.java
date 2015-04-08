/**
 * Created by qinsky31 on 2015/1/27.
 * Warning: {0,0,0} => "0" NOT "000"
 */
public class Solution {
    public static boolean larger(int a,int b) {
        boolean result = true;
        String a1 = String.valueOf(a) + String.valueOf(b);
        String a2 = String.valueOf(b) + String.valueOf(a);
        for (int i=0;i<a1.length();i++) {
            if (a1.charAt(i)<a2.charAt(i)) {
                return false;
            }else if (a1.charAt(i)>a2.charAt(i)) {
                return true;
            }
        }

        return result;
    }
    public static String largestNumber(int[] num) {
        String result = "";
        if (num.length==0) {
            return "";
        }

        for (int i=0;i<num.length-1;i++) {
            for (int j=i+1;j<num.length;j++) {
                if (!larger(num[i],num[j])) {
                    int tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }

        for (int i=0;i<num.length;i++) {
            result += String.valueOf(num[i]);
        }

        if (result.charAt(0)=='0') {
            return "0";
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {0,0};
        System.out.println(largestNumber(num));
    }
}
