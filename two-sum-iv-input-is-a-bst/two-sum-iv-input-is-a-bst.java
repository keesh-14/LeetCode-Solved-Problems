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
    ArrayList<Integer> al = new ArrayList<Integer>();
    public void preOrder(TreeNode root)
    {
        if(root == null)
            return ;
        preOrder(root.left);
        al.add(root.val);
        preOrder(root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        if(root == null)
            return false;
        preOrder(root);
        int i = 0;
        int j = al.size()-1;
       while(i<j)
       {
           if(al.get(i)+al.get(j)==k)
               return true;
           else if(al.get(i)+al.get(j)>k)
           {
               j--;
           }
           else 
           {
               i++;
           }
       }
        return false;
    }
}