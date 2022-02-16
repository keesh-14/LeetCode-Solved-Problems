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
    public ListNode swapPairs(ListNode head) {
        ListNode prev = null;
        if(head==null || head.next==null)
            return head;
        ListNode curr = head;
        while(curr!=null && curr.next!=null)
        {
            if(prev ==null)
            {
                head = curr.next;
                curr.next = curr.next.next;
                head.next = curr;
            
            }
            else 
            {
                prev.next = curr.next;
                curr.next = prev.next.next;
                prev.next.next = curr;
                
                
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
}