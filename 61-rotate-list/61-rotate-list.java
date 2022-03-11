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
        ListNode start = head;
        ListNode curr = head;
        if(head == null)
            return null;
        int n = 0;
        while(curr.next!=null)
        {
            curr = curr.next;
            n++;
        }
        n++;
        int s = 0;
        ListNode end = curr;
        curr = head;
        k=k%n;
        if(k==0 || n==1 )
            return head;
        while(s!=n-k-1)
        {
            curr = curr.next;
            s++;
            
        }
        head = curr.next;
        curr.next=null;
        end.next = start;
        return head;
    }
}