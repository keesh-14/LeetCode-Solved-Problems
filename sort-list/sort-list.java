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
        ListNode curr1=l1;
        ListNode curr3=l2;
    
        if(l1==null && l2==null)
            return null;
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode ptr = null;
        if(curr1.val<curr3.val)
        {
            ptr = curr1;
            curr1=curr1.next;
         
        }
        else 
        {
            ptr = curr3;
            curr3=curr3.next;
        }
        ListNode c =ptr;
        while(curr3!=null && curr1!=null)
        {
            if(curr3.val > curr1.val )
            {
                ptr.next = curr1;
                ptr = ptr.next;
                curr1 = curr1.next;
            }else 
            {
                 ptr.next = curr3;
                ptr = ptr.next;
                curr3 = curr3.next;
            }
        }
        if(curr3!=null)
        {
            ptr.next = curr3;
            
        }
        if(curr1!=null)
        {
            ptr.next = curr1;
            
        }
        return c;
    }
    
    public ListNode sortList(ListNode head) {
    
        
        ListNode curr1 = head;
        ListNode curr2 = head;
        ListNode ptr = null;
        ListNode curr3 = head;
        if(head == null || head.next==null)
            return head;
        while(curr2!=null && curr2.next !=null && curr2.next.next!=null)
        {
            curr1 = curr1.next;
            curr2 = curr2.next.next;
        }
        ListNode curr = curr1.next;
        curr1.next = null;
    
        ListNode left = sortList(curr3);
        ListNode right = sortList(curr);
        return merge(left,right);
        
    }
}