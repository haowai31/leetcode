/**
 * Created by qinsky31 on 2015/1/27.
 */
public class Solution {
    public static String countAndSay(int n) {
        String result = "";
        String object;
        if (n<1) {
            return "";
        }
        if (n==1) {
            return "1";
        }
        else {
            object = countAndSay(n - 1);
        }

        char chr = object.charAt(0);
        int count = 1;
        int flag = 1;
        for(int i=1;i<object.length();i++){
            if (object.charAt(i)==chr) {
                count ++;
                flag = 1;
            }
            else {
                result = result + String.valueOf(count) + chr;
                chr = object.charAt(i);
                count = 1;
                flag = 0;
            }
        }
        result = result + String.valueOf(count) + chr;

        return result;
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println(countAndSay(n));
    }
}
