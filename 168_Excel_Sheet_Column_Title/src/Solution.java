/*
 * Author:qinsky31;
 * 
 * UseTo:LeetCode
 * 
 * Function:Excel_Sheet_Column_Title
 * 
 * Date:2015年1月13日 下午4:12:37
 */


public class Solution {
    public static String convertToTitle(int n) {
    	String result = "";
    	
    	while (n>0){
    		int yushu = n - (n/26)*26;
    		if (yushu==0){
    			yushu=26;
    		}
    		n=(n-yushu)/26;    		
    		result = (char)(yushu+'A'-1) + result;
    	}
    	
        return result;
    }
	
	
    public static void main(String[] args){
    	int n=33;
    	System.out.println(convertToTitle(n));
    }
}
