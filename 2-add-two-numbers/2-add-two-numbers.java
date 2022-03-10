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
       ListNode curr1 = l1; // creating the 1st pointer
        ListNode curr2 = l2; // creating the 2nd pointer
        ListNode temp = new ListNode((curr1.val+curr2.val)%10); //taking the last value
        ListNode curr=null;  // pointer to iterate over the 1st linked list
        ListNode ptr;  // pointer to keep the head preserved
        curr = temp;   // pointer pointing to the 1st node
        ptr = curr;    // storing head 
        int c = (curr1.val+curr2.val)/10;  //taking out the carry
        curr1=curr1.next; // moving in the 2nd iteration of the 1st list
        curr2=curr2.next; //moving in the 2nd iteration of the 2nd list
        while(curr1!=null && curr2!=null)  // // iterate till any one of them does not become null
        {
            // repeating the same process as above
            ListNode temp1 = new ListNode((curr1.val+curr2.val+c)%10);
            c = (curr1.val+curr2.val+c)/10;
            curr.next = temp1;
            curr = curr.next;
            curr1=curr1.next;
            curr2 = curr2.next;
            
        }
        while(curr1!=null)
        {
            //smae as above 
            ListNode temp1 = new ListNode((curr1.val+c)%10);
            c = (curr1.val+c)/10;
            curr.next = temp1;
            curr = curr.next;
            curr1=curr1.next;
            
        }
        while(curr2!=null)
        {
            //same as above
            ListNode temp1 = new ListNode((curr2.val+c)%10);
            c = (curr2.val+c)/10;
            curr.next = temp1;
            curr = curr.next;
            curr2=curr2.next;
            
        }
        if(c!=0) // for the last iteration if there is a carry over left
        {
            ListNode temp1 = new ListNode(c);
            curr.next=temp1;
        }
        return ptr; // returning head
        
    }
}