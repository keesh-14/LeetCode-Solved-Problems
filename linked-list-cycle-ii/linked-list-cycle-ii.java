/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if(slow==null || slow.next==null)
            return null;
        while(fast!=null && fast.next!=null)
        {
            slow= slow.next;
            fast = fast.next.next;
            if(fast==slow)
                break;
        }
        if(slow!=fast)
            return null;
        
        slow=head;
        if(slow==fast)
            return fast;
        while(fast.next!=slow.next)
        {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.next;
        }
}