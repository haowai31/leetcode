/**
 * Created by qinsky31 on 2015/1/28.
 */
public class Solution {
    public static int numDecodings(String s) {
        int result = 0;
        int[] max = new int[s.length()];
        if (s.length()==0) {
            return 0;
        }else if (s.length()==1) {
            if (s.charAt(0)=='0') {
                return 0;
            }else {
                return 1;
            }
        }
        if (s.charAt(0)=='0') {
            return 0;
        }
        if (s.charAt(0)>='1' && s.charAt(0)<='9') {
            max[0] = 1;
        }
        int x = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
        if (x>=10 && x<=26) {
            max[1] += 1;
        }
        if (s.charAt(1)<='9' && s.charAt(1)>='1') {
            max[1] += 1;
        }
        for (int i = 2;i<s.length();i++) {
            x = (s.charAt(i-1) - '0') * 10 + (s.charAt(i) - '0');
            if (x>=10 && x<=26) {
                max[i] += max[i-2];
            }
            if (s.charAt(i)<='9' && s.charAt(i)>='1') {
                max[i] += max[i-1];
            }
        }
        result = max[s.length()-1];
        return result;
    }

    public static void main(String[] args) {
        String s = "100";
        System.out.println(numDecodings(s));
    }
}
