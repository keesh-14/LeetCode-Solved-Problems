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
    int max = 0;
    public int  depth(TreeNode root,int x)
    {
        if(root==null)
            return -1;
        if(root.val == x)
            return 0;
        int left  = depth(root.left,x);
        int right = depth(root.right,x);
        if(left!=-1)
            return left+1;
        if(right!=-1)
            return right +1;
        return -1;
         
    }
    public TreeNode parent(TreeNode root,int x)
    {
        
        
        if(root==null)
            return null;
        if(root.left ==null && root.right==null)
            return null;
        
        if(root.left!=null && root.left.val==x)
            return root;
        if(root.right!=null && root.right.val==x)
            return root;
        TreeNode left = parent(root.left,x);
        TreeNode right = parent(root.right,x);
        if(left==null)
            return right;
        return left;
    }
    public boolean isCousins(TreeNode root, int x, int y) {
       if(root==null)
           return false;
        if(root.val==x || root.val==y)
            return false;
        int d1 = depth(root,x);
        max = 0;
        int d2 = depth(root,y);
        
        TreeNode dp1 =  parent(root,x);
        TreeNode dp2 =  parent(root,y);
        System.out.println(dp1.val+" "+dp2.val);
        System.out.println(d1+" "+d2);
        if(d1==d2 && dp1.val != dp2.val)
            return true;
        
            return false;
        
    }
}