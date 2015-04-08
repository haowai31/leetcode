import java.util.ArrayList;
import java.util.List;

/**
 * Created by qinsky31 on 2015/1/29.
 */

public class Solution {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int result = Integer.MAX_VALUE;
        int row = triangle.size();
        if (row == 0) {
            return 0;
        }
        int[] min = new int[row];
        min[0] = triangle.get(0).get(0);
        for (int i=1;i<row;i++){
            for (int j=triangle.get(i).size()-1;j>=0;j--) {
                if (j==0) {
                    min[j] = min[j] + triangle.get(i).get(j);
                }else if (j==triangle.get(i).size()-1){
                    min[j] = min[j-1] + triangle.get(i).get(j);
                }else {
                    min[j] = Math.min(min[j-1],min[j]) + triangle.get(i).get(j);
                }
            }
        }
        for (int i=0;i<row;i++) {
            if (result>min[i]) {
                result = min[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> a1 = new ArrayList<Integer>();
        a1.add(2);
        List<Integer> a2 = new ArrayList<Integer>();
        a2.add(3);
        a2.add(4);
        List<Integer> a3 = new ArrayList<Integer>();
        a3.add(6);
        a3.add(4);
        a3.add(7);
        List<Integer> a4 = new ArrayList<Integer>();
        a4.add(4);
        a4.add(1);
        a4.add(8);
        a4.add(3);

        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        triangle.add(a1);
        triangle.add(a2);
        triangle.add(a3);
        triangle.add(a4);
        System.out.println(minimumTotal(triangle));
    }
}
