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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode  curr1 = l1;
        ListNode curr2 = l2;
        ListNode head = null;
        
        if(l1==null && l2==null)
            return null;
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
            if(curr1.val<curr2.val)
            {
                head = curr1;
                curr1 = curr1.next;
            }
             else 
             {
                 head = curr2;
                 curr2 = curr2.next;
             }
        ListNode ptr = head;
           while(curr1!=null && curr2!=null)
           {
               if(curr1.val<curr2.val)
               {
                   ptr.next=curr1;
                   ptr = ptr.next;
                   curr1=curr1.next;
               }
               else
               {
                   ptr.next = curr2;
                   ptr = ptr.next;
                   curr2 = curr2.next;
               }
           }
        while(curr2!=null)
        {
            ptr.next = curr2;
            curr2 = curr2.next;
            ptr = ptr.next;
        }
        while(curr1!=null)
        {
            ptr.next = curr1;
            curr1 = curr1.next;
            ptr = ptr.next;
        }
        
        return head;
    }
}