/*
 * Author:qinsky31;
 * 
 * UseTo:LeetCode
 * 
 * Function:155_Min_Stack
 * 
 * Date:2015年1月14日 上午10:18:42
 */


public class Solution {
	public static void main(String[] args) {
		
		MinStack stack = new MinStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(8);
		stack.push(0);
		stack.push(9);
		
		System.out.println(stack.getMin());
		stack.pop();
		stack.pop();
		System.out.println(stack.getMin());
	}
}
