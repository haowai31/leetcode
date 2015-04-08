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
                one.add(condidates[i]);
                List<Integer> tmp = new ArrayList<Integer>();
                tmp.addAll(one);
                result.add(tmp);
                one.remove(one.size()-1);
            }else if (condidates[i]<target - sum) {
                one.add(condidates[i]);
                find(one,i,sum + condidates[i],target,condidates);
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
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> one = new ArrayList<Integer>();
        Arrays.sort(candidates);
        find(one,0,0,target,candidates);
        return result;
    }
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        Solution s = new Solution();
        List<List<Integer>> result = s.combinationSum(candidates, target);
        for (int i=0;i<result.size();i++) {
            List<Integer> one = result.get(i);
            for (int j=0;j<one.size();j++) {
                System.out.print(String.valueOf(one.get(j)) + " ");
            }
            System.out.println();
        }
    }
}