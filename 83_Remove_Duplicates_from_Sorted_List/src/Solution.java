/**
 * Created by qinsky31 on 2015/1/27.
 */
public class Solution {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode result = head;
        ListNode tmp = result;
        if (result==null) {
            return result;
        }
        while (head!=null && head.next!=null) {
            if (head.val!=head.next.val) {
                tmp.next = head.next;
                tmp = tmp.next;
            }
            head = head.next;
        }
        if (tmp.next!=null) {
            tmp.next = null;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(1);
        ListNode a3 = new ListNode(1);
        ListNode a4 = new ListNode(3);
        ListNode a5 = new ListNode(3);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        ListNode result = deleteDuplicates(a1);
        while (result!=null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
