/**
 * Created by qinsky31 on 2015/1/27.
 */
public class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result;
        ListNode head;
        if (l1 == null && l2 == null){
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val<=l2.val) {
            head = l1;
            l1 = l1.next;

        }
        else {
            head = l2;
            l2 = l2.next;
        }
        result = head;
        while (l1!=null && l2!=null) {
            if (l1.val<=l2.val) {
                head.next = l1;
                head = head.next;
                l1 = l1.next;
            }
            else {
                head.next = l2;
                head = head.next;
                l2 = l2.next;
            }
        }
        if (l1==null) {
            head.next = l2;
        }else {
            head.next = l1;
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(5);
        ListNode a4 = new ListNode(6);
        ListNode b1 = new ListNode(2);
        ListNode b2 = new ListNode(4);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        b1.next = b2;
        ListNode result = mergeTwoLists(a1,b1);
        while (result.next!=null) {
            System.out.println(result.val);
            result = result.next;
        }
        System.out.println(result.val);
    }
}
