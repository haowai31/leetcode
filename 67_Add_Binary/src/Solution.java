/**
 * Created by qinsky31 on 2015/1/27.
 */
public class Solution {
    public static String addBinary(String a, String b) {
        String result = "";
        int flag = 0;
        int pointa = a.length() - 1;
        int pointb = b.length() - 1;
        if (a.length()==0) {
            return b;
        }
        if (b.length()==0) {
            return a;
        }
        char chra;
        char chrb;
        while (pointa>=0 || pointb>=0) {
            if (pointa>=0) {
                chra = a.charAt(pointa);
                pointa --;
            }else {
                chra = '0';
            }
            if (pointb>=0) {
                chrb = b.charAt(pointb);
                pointb --;
            }else {
                chrb = '0';
            }

            if (chra==chrb) {
                if (flag == 0) {
                    result = '0' + result;
                }else {
                    result = '1' + result;
                    flag = 0;
                }
                if (chra=='1') {
                    flag = 1;
                }
            }else {
                if (flag == 0) {
                    result = '1' + result;
                }else {
                    result = '0' + result;
                    flag = 1;
                }
            }
        }
        if (flag == 1) {
            result = '1' + result;
            flag = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        String a = "";
        String b = "1";
        System.out.println(addBinary(a,b));
    }
}
