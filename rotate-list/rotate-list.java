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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null )
            return head;
        ListNode curr = head;
        ListNode slow = head;
        ListNode fast = head;
        int g=0;
        ListNode q = head;
        while(q!=null)
        {
            q=q.next;
            g++;
        }
        int c=k%g;
        if(c==0)
            return head;
        while(c-->0)
        {
            fast = fast.next;
        }
        ListNode p=null;
        while(fast!=null)
        {
            p=slow;
            slow = slow.next;
            fast = fast.next;
        }
        p.next = null;
        ListNode curr1 = slow;
        while(curr1.next !=null)
        {
            curr1 = curr1.next;
        }
        curr1.next=curr;
        return slow;
    }
}