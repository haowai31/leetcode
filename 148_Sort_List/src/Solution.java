/**
 * Created by qinsky31 on 2015/1/28.
 */
public class Solution {
    public static ListNode getMid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (true) {
            if (fast.next!=null) {
                fast = fast.next;
                if (fast.next!=null) {
                    fast = fast.next;
                }else {
                    break;
                }
                slow = slow.next;
            }else {
                break;
            }
        }
        return slow;
    }

    public static ListNode merge(ListNode left,ListNode right) {
        ListNode result = new ListNode(0);
        ListNode head = result;

        while (left!=null && right!=null) {
            if (left.val<right.val) {
                head.next = left;
                left = left.next;
                head = head.next;
            }else {
                head.next = right;
                right = right.next;
                head = head.next;
            }
        }
        if (left!=null) {
            head.next = left;
        }
        if (right!=null) {
            head.next = right;
        }
        return result.next;
    }

    public static ListNode sortList(ListNode head) {
        ListNode result = head;
        if (head==null || head.next==null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode head2 = mid.next;
        mid.next = null;

        return merge(sortList(head),sortList(head2));
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(8);
        ListNode a3 = new ListNode(5);
        ListNode a4 = new ListNode(7);
        ListNode a5 = new ListNode(2);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        ListNode result = sortList(a1);
        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
