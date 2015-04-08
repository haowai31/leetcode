/*
 * Author:qinsky31;
 * 
 * UseTo:LeetCode
 * 
 * Function:Intersection_of_Two_Linked_Lists
 * 
 * Date:2015年1月14日 上午9:44:17
 */


public class Solution {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	ListNode result = null;
    	ListNode tmpA = headA;
    	ListNode tmpB = headB;
    	int countA = 0;
    	int countB = 0;
    	
    	if (tmpA==null || tmpB==null){
    		return result;
    	}
    	while (tmpA.next!=null){
    		tmpA = tmpA.next;
    		countA++;
    	}
    	while (tmpB.next!=null){
    		tmpB = tmpB.next;
    		countB++;
    	}
    	
        if (tmpA.val==tmpB.val){
        	tmpA = headA;
        	tmpB = headB;
        	if (countA<countB){
        		tmpB = headA;
        		tmpA = headB;        		
        		
        		int temp = countA;
        		countA = countB;
        		countB = temp;
        	}
        	for(int i=0;i<countA-countB;i++){
        		tmpA = tmpA.next;
        	}
        	while (true){
        		if (tmpA==tmpB){
        			result = tmpA;
        			return result;
        		}
        		else {
        			tmpA = tmpA.next;
            		tmpB = tmpB.next;
        		}        		
        	}
        }        
        
    	
    	return result;
    }

	public static void main(String[] args) {
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(3);
		ListNode a4 = new ListNode(4);
		ListNode a5 = new ListNode(5);
		ListNode headA = new ListNode(0);
		headA.next = a1;
		
		ListNode b1 = new ListNode(1);
		ListNode b2 = new ListNode(8);
		ListNode headB = new ListNode(0);
		headB.next = a1;
		
//		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
//		b1.next = b2;
		if (getIntersectionNode(headA, headB)!=null){
			System.out.println(getIntersectionNode(headA,headB).val);
		}
		else {
			System.out.println("NULL");
		}
		
	}
}
