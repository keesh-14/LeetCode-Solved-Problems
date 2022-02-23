/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Node,Node> hm = new HashMap<Node,Node>();
    public Node cloneGraph(Node node) {
       if(node==null)
           return node;
        Node cloned = hm.get(node);
        if(cloned!=null)
            return cloned;
        
        cloned = new Node(node.val);
        hm.put(node,cloned);
        
        for(Node t : node.neighbors)
        {
            cloned.neighbors.add(cloneGraph(t));
        }
        
        return cloned;
        
        
    }
}