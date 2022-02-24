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
    public ListNode merge(ListNode l1,ListNode l2)
    {
        
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode ptr = null;
        if(curr2.val>curr1.val)
        {
            ptr = curr1;
            curr1 = curr1.next;
        }
        else 
        {
            ptr = curr2;
            curr2 = curr2.next;
        }
        ListNode c = ptr;
        while(curr1!=null && curr2!=null)
        {
            if(curr1.val>curr2.val)
            {
                ptr.next = curr2;
                ptr = curr2;
                curr2 = curr2.next;
            }
            else 
            {
                ptr.next = curr1;
                ptr = curr1;
                curr1 = curr1.next;
            }
        }
        if(curr1!=null)
        {
            ptr.next = curr1;
        }
        if(curr2!=null)
        {
            ptr.next = curr2;
        }
        return c;
    }
    public ListNode sortList(ListNode head)
    {
        if(head == null || head.next==null)
            return head;
        
        ListNode curr1 = head;
        ListNode curr2 = head;
        while(curr2!=null && curr2.next!=null && curr2.next.next!=null)
        {
            curr1 = curr1.next;
            curr2 = curr2.next.next;
        }
        ListNode curr = curr1.next;
        curr1.next = null;
        curr2 = head;
        ListNode left = sortList(curr2);
        ListNode right = sortList(curr);
        ListNode p = merge(left,right);
        return p;
        
    }
}