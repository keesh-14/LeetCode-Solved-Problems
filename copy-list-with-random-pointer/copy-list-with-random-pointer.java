/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        Node curr1 = head;
        Node curr2 = null;
        Node head2  = null;
        ArrayList<Node> al   = new ArrayList<Node>();
        Node  t = head;
        while(t!=null)
        {
            al.add(t);
            t = t.next;
            
        }
        while(curr1!=null)
        {
            Node next = curr1.next;
            if(curr2==null)
            {
                Node temp = new Node(curr1.val);
                curr2 = temp;
                head2 = curr2;
            }
            else 
            {
                Node temp = new Node(curr1.val);
                curr2.next = temp;
                curr2 = curr2.next;
                
            }
            curr1.next = curr2;
            curr2.random = curr1; 
            curr1 = next;
            
        }
        curr1 = head;
        curr2 = head2;
        while(curr2!=null)
        {
            if(curr2.random.random==null)
            {
                curr2.random = null;
            }
            else 
            {
            curr2.random = curr2.random.random.next;
            }
            curr2 = curr2.next;
        }
        Node curr = head;
        for(int i=1;i<al.size();i++)
        {
            curr.next = al.get(i);
            curr = curr.next;
        }
        curr.next = null;
        return head2;
        
    }
}