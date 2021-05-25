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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode curr2 = head;
            for(int i=0;i<n;i++)
                curr = curr.next;
        if(head.next==null)
            return null;
        if(curr==null)
            return head.next;
        while(curr.next!=null)
        {
            curr = curr.next;
            curr2 = curr2.next;
        }
        curr2.next = curr2.next.next;
        return head;
    }
}