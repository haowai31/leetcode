import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by qinsky31 on 2015/2/4.
 */
public class Solution {
    private List<List<Integer>> result = new ArrayList<List<Integer>>();
    public void find(List<Integer> one,int begin,int sum,int target,int[] condidates){
        for (int i=begin;i<condidates.length;i++) {
            if (target - sum == condidates[i]) {
                if (!(i>0 && condidates[i]==condidates[i-1] && !one.contains(i-1))) {
                    one.add(i);
                    List<Integer> tmp = new ArrayList<Integer>();
                    for (int j=0;j<one.size();j++) {
                        tmp.add(condidates[one.get(j)]);
                    }
                    result.add(tmp);
                    one.remove(one.size()-1);
                }
            }else if (condidates[i]<target - sum) {
                if (!(i>0 && condidates[i]==condidates[i-1] && !one.contains(i-1))) {
                    one.add(i);
                    find(one,i + 1,sum + condidates[i],target,condidates);
                }
            }else {
                if (one.size()>0) {
                    one.remove(one.size() - 1);
                }
                return;
            }
        }
        if (one.size()>0) {
            one.remove(one.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> one = new ArrayList<Integer>();
        Arrays.sort(candidates);
        find(one, 0, 0, target, candidates);
        return result;
    }

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        Solution s = new Solution();
        List<List<Integer>> result = s.combinationSum2(candidates, target);
        for (int i=0;i<result.size();i++) {
            List<Integer> one = result.get(i);
            for (int j=0;j<one.size();j++) {
                System.out.print(String.valueOf(one.get(j)) + " ");
            }
            System.out.println();
        }
    }
}
