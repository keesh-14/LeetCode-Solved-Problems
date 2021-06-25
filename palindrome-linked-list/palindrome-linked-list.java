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
    public ListNode reverse(ListNode head)
    {
        if(head.next==null)
            return head;
        ListNode prev=null;
        ListNode curr = head;
        ListNode Next = head.next;
        while(Next!=null)
        {
            curr.next = prev;
            prev = curr;
            curr = Next;
            Next=Next.next;
        }
        curr.next=prev;
        prev = curr;
        return prev; 
    }
    public boolean check(ListNode ptr1,ListNode ptr2)
    {
        while(ptr1!=null && ptr2!=null)
        {
            if(ptr1.val!=ptr2.val)
                return false;
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return true;
    }
 public boolean isPalindrome(ListNode head) {
     ListNode slow = head;
     ListNode fast = head;
     ListNode ptr1 = head;
    ListNode  ptr2 =null;
     if(head.next == null)
         return true;
     while(fast!=null && fast.next!=null && fast.next.next!=null)
     {
         fast=fast.next.next;
         slow=slow.next;
     }
      ptr2 = slow.next;
      slow.next = null;
      ListNode p = reverse(ptr2);
      return check(ptr1,p); 
    }
}