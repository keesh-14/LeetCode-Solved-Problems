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
    public ListNode deleteDuplicates(ListNode head) {
     ListNode curr1=head;
        if(head == null)
            return head;
        ListNode curr2=head.next;
        while(curr1!=null)
        {
            while(curr2!=null && curr1.val == curr2.val)
                curr2=curr2.next;
            
            curr1.next = curr2;
            curr1 = curr1.next;

        }
        return head;
    }
}