import java.util.ArrayList;

/**
 * Created by qinsky31 on 2015/1/28.
 */
public class Solution {
    public static String reverseWords(String s) {
        String result = "";
        ArrayList<String> words = new ArrayList<String>();

        String word = "";
        int count = 0;
        while(count<s.length()) {
            if (s.charAt(count)!=' ') {
                word += s.charAt(count);
            }else if (word.compareTo("")!=0) {
                words.add(word);
                word = "";
            }
            count++;
        }
        if (word.compareTo("")!=0) {
            words.add(word);
            word = "";
        }
        for (int i=0;i<words.size();i++) {
            result += words.get(words.size()-i-1);
            if (i!=words.size()-1) {
                result += ' ';
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "a";
        System.out.println(reverseWords(s));
    }
}
