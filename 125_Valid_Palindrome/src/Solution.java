/*
 * Author:qinsky31;
 * 
 * UseTo:LeetCode
 * 
 * Function:125_Valid_Palindrome
 * 
 * Date:2015年1月14日 上午10:45:47
 */


public class Solution {
    public static boolean isPalindrome(String s) {
    	boolean result = true;
    	if (s.length()==0){
    		return false;
    	}
    	
    	int top = 0;
    	int tail = s.length()-1;
    	while (top<tail){
    		while (((s.charAt(top)<='Z' && s.charAt(top)>='A') || (s.charAt(top)<='z' && s.charAt(top)>='a') || (s.charAt(top)<='9' && s.charAt(top)>='0'))==false){
    			top++;
    			if (top>tail){
    				return true;
    			}
    		}
    		while (((s.charAt(tail)<='Z' && s.charAt(tail)>='A') || (s.charAt(tail)<='z' && s.charAt(tail)>='a') || (s.charAt(tail)<='9' && s.charAt(tail)>='0'))==false){
    			tail--;
    			if (top>tail){
    				return true;
    			}
    		}
    		if (s.charAt(top)!=s.charAt(tail) && java.lang.Math.abs(s.charAt(top)-s.charAt(tail))!=32){
    			return false;
    		}
    		else {
    			top++;
    			tail--;
    		}
    	}
        
    	return result;
    }

	public static void main(String[] args) {
		String s = "ab2a";
		
		System.out.println(isPalindrome(s));
	}
}
