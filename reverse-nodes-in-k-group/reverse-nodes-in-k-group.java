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
        ListNode prev = null;
        ListNode curr = head;
        ListNode Next = head.next;
        while(Next!=null)
        {
            curr.next = prev;
            prev = curr;
            curr = Next;
            Next = Next.next;
        }
        curr.next = prev;
        prev = curr;
        return prev;
        
    }
    public ListNode reverseKGroup(ListNode head, int k) {
    ListNode ptr1 = null;
        ListNode ptr2 = head;
        ListNode ptr3 = null;
        ListNode ptr4 = head; 
        ListNode rev;
        ListNode h=null;
        while(true)
        {  
            int i = k;
            while(i-->0 && ptr4!=null)
            {
                ptr3=ptr4;
                ptr4=ptr4.next;
                
            }
            if(i!=-1)
                break;
            ptr3.next=null; 
            if(ptr1==null)
            {
                rev = reverse(ptr2);
                ptr1 = rev;
                h=ptr1;
            }
            else 
            {
                rev = reverse(ptr2);
                ptr1.next = rev;
            }
            ptr2.next = ptr4;
            ptr1=ptr2;
            ptr2=ptr4;
        }
        return h;
    }
}
