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
    public ListNode merge(ListNode head1,ListNode head2)
    {
        ListNode curr1 = head1;
        ListNode curr2 = head2;
        ListNode curr = null;
        if(head1==null && head2==null)
            return null;
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;
        
        if(curr1.val>curr2.val)
        {
            curr=curr2;
            curr2=curr2.next;
        }
        else 
        {
            curr = curr1;
            curr1 = curr1.next;
        }
        ListNode h = curr;
        while(curr1!=null && curr2!=null)
        {
            if(curr1.val<curr2.val)
            {
                curr.next = curr1;
                curr = curr.next;
                curr1 = curr1.next;
            }
            else 
            {
                curr.next = curr2;
                curr = curr.next;
                curr2 = curr2.next;
            }
        }
        while(curr1!=null)
        {
            curr.next = curr1;
            curr = curr.next;
            curr1 = curr1.next;
        }
        while(curr2!=null)
        {
            curr.next = curr2;
            curr = curr.next;
            curr2 = curr2.next;
        }
        return h;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length==0)
            return null;
        if(lists.length==1)
            return lists[0];
             ListNode c = merge(lists[0],lists[1]);
            for(int i=2;i<lists.length;i++)
            {
                c= merge(c,lists[i]);
            }
        return c;
    }
}