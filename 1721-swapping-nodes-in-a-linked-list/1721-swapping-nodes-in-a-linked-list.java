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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode front = head;
        ListNode back = head;
        int t = 0;
        while(t<k-1)
        {
            front = front.next;
            t++;
        }
        ListNode curr  = front;
        while(front.next!=null)
        {
            front = front.next;
            back = back.next;
        }
        int temp = back.val;
        back.val = curr.val;
        curr.val = temp;
        return head;
        
    }
}