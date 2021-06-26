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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = null;
        ListNode curr3 = list2;
        ListNode curr4 = null;
        int k = 1;
        while(k!=a)
        {
            curr1 = curr1.next;
            k++;
        }
        
        curr2 = curr1.next;
        curr1.next = list2;
        while(curr3.next!=null)
        {
            curr3 = curr3.next;
        }
    
        while(k!=b+1)
        {
            curr4=curr2;
            curr2 = curr2.next;
            k++;
        }
        curr4.next = null;
        curr3.next = curr2;
        return list1;
    }
}