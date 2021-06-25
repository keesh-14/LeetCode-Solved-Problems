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
    public ListNode oddEvenList(ListNode head) {
       ListNode p=head;
        if(head==null)
            return null;
       ListNode q=head.next;
       ListNode c = q;
       while(q!=null && q.next!=null)
       {
           p.next = p.next.next;
           p=p.next;
           q.next = q.next.next;
           q=q.next;
           
       }
        p.next = c;
        return head;
    }
}