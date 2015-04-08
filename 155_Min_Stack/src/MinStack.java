/*
 * Author:qinsky31;
 * 
 * UseTo:LeetCode
 * 
 * Function:155_Min_Stack
 * 
 * Date:2015年1月14日 上午10:45:57
 */


import java.util.ArrayList;


public class MinStack {
	private ArrayList<Integer> stack = new ArrayList<Integer>();
	private ArrayList<Integer> min = new ArrayList<Integer>();
	private int point = 0;
    public void push(int x) {
    	if (point>0){
    		if (x<min.get(point-1)){
    			min.add(x);
    		}
    		else {
    			min.add(min.get(point-1));
    		}
    	}
    	else{
    		min.add(x);
    	}
        stack.add(x);
        point++;
    }

    public void pop() {
        if (point>0){
        	stack.remove(point-1);
        	min.remove(point-1);
        	point--;
        }
    }

    public int top() {
    	int result = 0;
    	if (point>0){
    		result = (int)stack.get(point-1);    		
    	}
    	
    	
    	return result;        
    }

    public int getMin() {
    	int result = 0;
    	result = min.get(point-1);
    	
    	return result;
    }
}
