/*
 * Author:qinsky31;
 * 
 * UseTo:LeetCode
 * 
 * Function:Excel_Sheet_Column_Number
 * 
 * Date:2015��1��13�� ����4:12:43
 */


public class Solution {
    public static int titleToNumber(String s) {
    	int result = 0;
    	
    	for (int i=0;i<s.length();i++){
    		result = 26*result + s.charAt(i) - 'A' + 1;
    	}
    	
        return result;
    }
    public static void main(String[] args){
    	String s = "AG";
    	System.out.println(titleToNumber(s));
    }
}
