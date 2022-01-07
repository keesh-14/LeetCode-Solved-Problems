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
    HashMap<Integer,ListNode> hm;
    public Solution(ListNode head) {
        hm = new HashMap<Integer,ListNode>();
        ListNode curr = head;
        int count = 0;
        while(curr!=null)
        {
            hm.put(count,curr);
            count++;
            curr = curr.next;
        }
    }
    
    public int getRandom() {
        return hm.get((int)(Math.random()*hm.size())).val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */