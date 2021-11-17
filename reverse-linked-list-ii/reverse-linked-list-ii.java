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
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode a = head;
        ListNode an = null;
        ListNode bn = null;
        if(right==left)
            return head;
        for(int i=1;i<left-1;i++)
        {
            a = a.next;
        }
        an = a.next;
        ListNode b = head;
        for(int i=1;i<right;i++)
        {
            b = b.next;
        }
        bn = b.next;
        b.next=null;
        if(left == 1)
        {
            ListNode temp = reverse(head);
            head.next = bn;
            return temp;
        }
        a.next = reverse(an);
        an.next  = bn;
        return head;   
     
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head;
        while(curr!=null)
        {
            next = next.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}