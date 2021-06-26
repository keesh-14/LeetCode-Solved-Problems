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
        ListNode curr1 = head;
        ListNode curr2 = head;
        ListNode curr3 = head;
        if(head.next==null || head==null)
            return head;
        int c=1;
        while(c!=k)
        {
            curr1 = curr1.next;
            curr2 = curr2.next;
            c++;
        }
        while(curr1.next!=null)
        {
            curr1 = curr1.next;
            curr3 = curr3.next;
        }
        int temp = curr3.val;
        curr3.val = curr2.val;
        curr2.val = temp;
        
        
        return head;
    }
}