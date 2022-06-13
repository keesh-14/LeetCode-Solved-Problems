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
   
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        if(head==null || head.next==null)
            return head;
        ListNode next = head.next;
        while(next!=null)
        {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next=prev;
        return curr;
    }
}