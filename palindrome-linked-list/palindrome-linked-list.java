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
    public boolean check(ListNode head1,ListNode head2)
    {
        ListNode temp1=head1;
        ListNode temp2 = head2;
        while(temp2!=null)
        {
            if(temp1.val!=temp2.val)
            {
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }
    public ListNode rev(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        ListNode Next = curr.next;
        while(Next!=null)
        {
            curr.next=prev;
            prev = curr;
            curr = Next;
            Next = Next.next; 
        }
        curr.next=prev;
        
        return curr;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode f = head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast = fast.next.next;
        }
        if(head.next==null)
            return true;
        if(slow.val == head.val && head.next.next==null)
            return true;
        ListNode c = head;
        int count=0;
       while(c!=null)
       {
           c=c.next;
           count++;
       }
        ListNode res;
       if(count%2==0)
          res = rev(slow);
        else 
          res = rev(slow.next);
         
        return check(f,res);
       
    }
}