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
    public ListNode middleNode(ListNode head) {
        ListNode curr1 = head;
        ListNode curr2 = head;
        if(head==null)
            return null;
        while(curr1!=null && curr1.next!=null)
        {
            curr1 = curr1.next.next;
            curr2 = curr2.next;
        }
        return curr2;
            
        
    }
}