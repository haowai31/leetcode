import java.util.ArrayList;
import java.util.List;

/*
 * Author:qinsky31;
 * 
 * UseTo:LeetCode
 * 
 * Function:119_Pascal's_Triangle_II
 * 
 * Date:2015年1月14日 下午1:15:39
 */


public class Solution {
    public static List<Integer> getRow(int rowIndex) {
    	List<Integer> result = new ArrayList();
    	for (int i=0;i<=rowIndex;i++){
    		int count = result.size();
    		for (int j=count-1;j>=1;j--){
    			result.set(j, result.get(j)+result.get(j-1));
    		}
    		result.add(1);
    	}
        return result;
    }

	public static void main(String[] args) {
		int k = 31;
		System.out.println(getRow(k));
	}
}
