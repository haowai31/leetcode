import java.util.HashSet;
import java.util.Set;

/**
 * Created by qinsky31 on 2015/1/29.
 */
public class Solution {
    public static boolean wordBreak(String s, Set<String> dict) {
        boolean result = true;
        boolean[] flag = new boolean[s.length()+1];
        if (s.length()==0) {
            return true;
        }
        if (dict.size()==0) {
            return false;
        }
        flag[0] = true;
        for (int i=0;i<s.length();i++) {
            if (flag[i]) {
                for (int j=i+1;j<=s.length();j++) {
                    String tmp = s.substring(i,j);
                    if (dict.contains(tmp)) {
                        flag[j] = true;
                    }
                }
            }
        }
        result = flag[s.length()];

        return result;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        Set<String> dict = new HashSet<String>();
        dict.add("leet");
        dict.add("code");
        System.out.println(wordBreak(s,dict));
    }
}
