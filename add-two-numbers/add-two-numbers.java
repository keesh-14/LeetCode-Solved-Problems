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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
         ListNode temp = new ListNode((curr1.val+curr2.val)%10);
        
        ListNode curr;
        ListNode ptr;
        curr = temp;
        ptr = curr;
            int c = (curr1.val+curr2.val)/10;
        curr1=curr1.next;
        curr2=curr2.next; 
        while(curr1!=null && curr2!=null)
        {
            
            ListNode temp1 = new ListNode((curr1.val+curr2.val+c)%10);
            c = (curr1.val+curr2.val+c)/10;
            curr.next = temp1;
            curr = curr.next;
            curr1=curr1.next;
            curr2 = curr2.next;
            
        }
        while(curr1!=null)
        {
            ListNode temp1 = new ListNode((curr1.val+c)%10);
            c = (curr1.val+c)/10;
            curr.next = temp1;
            curr = curr.next;
            curr1=curr1.next;
            
        }
        while(curr2!=null)
        {
            ListNode temp1 = new ListNode((curr2.val+c)%10);
            c = (curr2.val+c)/10;
            curr.next = temp1;
            curr = curr.next;
            curr2=curr2.next;
            
        }
        if(c!=0)
        {
            ListNode temp1 = new ListNode(c);
            curr.next=temp1;
        }
        return ptr;
        
    }
}