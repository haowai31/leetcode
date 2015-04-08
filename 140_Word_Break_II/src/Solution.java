import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by qinsky31 on 2015/1/29.
 */
public class Solution {
    public static List<String> wordBreak(String s, Set<String> dict) {
        List<String> result = new ArrayList<String>();
        List<List<String>> store = new ArrayList<List<String>>();
        boolean[] flag = new boolean[s.length()+1];
        if (s.length()==0) {
            return result;
        }
        if (dict.size()==0) {
            return result;
        }
        flag[0] = true;
        int flaga = 0;
        for (int i=s.length()-1;i>=0;i--) {
            String tmp = s.substring(i,s.length());
            if (dict.contains(tmp)) {
                flaga = 1;
            }
        }
        if (flaga==0) {
            return result;
        }
        for (int i=0;i<=s.length();i++) {
            List<String> tmp = new ArrayList<String>();
            store.add(tmp);
        }
        for (int i=0;i<s.length();i++) {
            if (flag[i]) {
                for (int j=i+1;j<=s.length();j++) {
                    String tmp = s.substring(i,j);
                    if (dict.contains(tmp)) {
                        flag[j] = true;
                        List<String> words = store.get(i);
                        List<String> newwords = new ArrayList<String>();
                        for (int k=0;k<words.size();k++) {
                            newwords.add(words.get(k) + ' ' + tmp);
                        }
                        if (words.size()==0) {
                            newwords.add(tmp);
                        }
                        if (store.get(j).size()==0) {
                            store.set(j, newwords);
                        }else {
                            List<String> tmp2 = store.get(j);
                            for (int k=0;k<newwords.size();k++) {
                                tmp2.add(newwords.get(k));
                            }
                        }
                    }
                }
            }
        }
        result = store.get(s.length());
        return result;
    }

    public static void main(String[] args) {
        String s = "abcd";
        Set<String> dict = new HashSet<String>();
        dict.add("a");
        dict.add("abc");
        dict.add("b");
        dict.add("cd");
/*        dict.add("sand");*/
        System.out.println(wordBreak(s,dict));
    }
}
