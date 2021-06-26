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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        ListNode curr1 = head;
        ListNode curr2 = null;
        while(curr1.next!=null)
        {
            curr2=curr1.next;
            int max = curr1.val;
            while(curr2!=null)
            {
                if(max<curr2.val)
                {
                    max = curr2.val;
                    break;
                }
                curr2=curr2.next;
            }
            if(curr1.val==max)
                al.add(0);
            else 
                al.add(max);
            curr1 = curr1.next;
        }
        al.add(0);
        int arr[] = new int[al.size()];
        for(int i=0;i<al.size();i++)
        {
            arr[i]=al.get(i);
        }
        return arr;
    }
}