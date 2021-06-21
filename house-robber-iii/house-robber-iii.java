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
    HashMap<TreeNode,Integer> hm = new HashMap<TreeNode,Integer>();
    public int rob(TreeNode root) {
        
        if(root == null)
            return 0;
        if(hm.containsKey(root))
            return hm.get(root);
        else
        {
          hm.put(root, Math.max(Include(root),Exclude(root)));
          
        }
        return hm.get(root);
    }
     public int Include(TreeNode root)
     {
         if(root==null)
             return 0;
    
       return Exclude(root.left) + Exclude(root.right) + root.val;
    }
  public int Exclude(TreeNode root)
  {
      if(root == null)
          return 0;
      
      return rob(root.left) + rob(root.right);
  }
}