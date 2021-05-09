/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr1 = headA;
        int n=0;
        int m=0;
        int i=0;
        ListNode curr2 = headB; 
        while(curr1!=null)
        {
            curr1 = curr1.next;
            n++;
        }
        while(curr2!=null)
        {
            curr2=curr2.next;
            m++;
        }
        int cnt = Math.abs(m-n);
        if(m<n)
        {
             i=0;
            curr1 = headA;
            curr2 = headB;
            while(i<cnt)
            {
                curr1 = curr1.next;
                i++;
            }
        }
        else if(m>n)
        { 
             i=0;
            curr2 = headB;
            curr1 = headA;
            while(i<cnt)
            {
                curr2= curr2.next;
                i++;
            }
        }
        else 
        {
             curr2 = headB;
            curr1 = headA;
        }
        while(curr1!=null && curr2!=null)
        {
            if(curr1 == curr2)
                return curr1;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return null;
    }
}