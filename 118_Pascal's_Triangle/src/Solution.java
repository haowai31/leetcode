import java.util.ArrayList;
import java.util.List;

/*
 * Author:qinsky31;
 * 
 * UseTo:LeetCode
 * 
 * Function:118_Pascal's_Triangle
 * 
 * Date:2015年1月14日 下午1:47:17
 */


public class Solution {
    public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList();
		numRows--;
		
		
    	for (int i=0;i<=numRows;i++){
    		List<Integer> row = new ArrayList<Integer>();
    		if (i!=0){
    			row.add(1);
    		}
    		for (int j=1;j<i;j++){
    			row.add(result.get(i-1).get(j)+result.get(i-1).get(j-1));
    		}
    		row.add(1);
    		result.add(row);
    	}
    	
    	
    	return result;        
    }

	public static void main(String[] args) {
		int k = 5;
		
		System.out.println(generate(k));
	}
}
