/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr1 = head;
        if(head == null)
            return null;
        ListNode curr2 = null;
        
        while(curr1!=null && curr1.next!=null)
        {
            curr2 = curr1.next;
            while(curr2!=null && curr2.val == val)
            {
                curr2 = curr2.next;
            }
            
            curr1.next  = curr2;
            curr1 = curr1.next;
        }
        if(head.val==val)
            return head.next;
        return head;
    }
}