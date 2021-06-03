/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        q.add(root);
        if(root==null)
            return al;
        
        // al.add(new ArrayList<Integer>(root.val));
            int n = 1;
        while(!q.isEmpty())
        {
            
            int c = q.size();
            n++;
            ArrayList<Integer> a = new ArrayList<Integer>();  
            for(int i=0;i<c;i++)
            {
                
                TreeNode curr = q.poll();
                 a.add(curr.val);
            
               if(curr.left!=null)
               {
                q.add(curr.left);
               }
              if(curr.right!=null)
               {
                q.add(curr.right);
               }
                
            }
            if(n%2==0)
                  al.add(a);
                else 
                {
                Collections.reverse(a);
                al.add(a);
                }
        }
       
        
        return al;
    }
}