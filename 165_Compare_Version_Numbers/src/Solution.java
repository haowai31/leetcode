/*
 * Author:qinsky31;
 * 
 * UseTo:LeetCode
 * 
 * Function:Compare_Version_Numbers
 * 
 * Date:2015年1月13日 下午4:12:26
 */


public class Solution {
    public static int compareVersion(String version1, String version2) {
    	int result = 0;
    	int count1 = 0;
    	int count2 = 0;
    	
    	int count = 0;
    	while (count<version1.length() || count<version2.length()){
	    	if (count<version1.length()){    		
	    		if (version1.charAt(count)!='.'){
	    			count1 = count1 * 10 + version1.charAt(count) - '0';
	    		}
	    	}
	    	else {
	    		if (version2.charAt(count)!='.') {
	    			count1 = count1 * 10;
	    		}
	    	}
	    	
	    	if (count<version2.length()){    		
	    		if (version2.charAt(count)!='.'){
	    			count2 = count2 * 10 + version2.charAt(count) - '0';
	    		}
	    	}
	    	else {
	    		if (version1.charAt(count)!='.') {
	    			count2 = count2 * 10;
	    		}
	    	}	    	
	    	
	    	count++;
    	}
    	
    	if (count1!=count2){
    		if (count1>count2){
    			result = 1;
    		}
    		else {
    			result = -1;
    		}
    	}
    	
        return result;
    }

    public static void main(String[] args){
    	String s1 = "1";
    	String s2 = "0.1";
    	System.out.println(compareVersion(s1,s2));
    }
}
