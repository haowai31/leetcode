
public class Solution {
    public static int majorityElement(int[] num) {
        int result = 0;
        int count = 0;
        for (int i=0;i<num.length;i++){
        	if (count==0){
        		result = num[i];
        		count++;
        	}
        	else
        	{
        		if (result==num[i]){
        			count++;
        		}
        		else{
        			count--;
        		}
        	}
        }
        return result;        
    }
    public static void main(String[] args){
    	int[] num = {2,3,4,3,3,3,2};
    	System.out.println(majorityElement(num));
    }
}
