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
    public void back(List<List<Integer>> res,List<Integer> al,int targetSum,TreeNode root)
    {
        if(root==null)
            return;
        al.add(root.val);
        if(root.left == null && root.right==null && targetSum-root.val==0)
        {
            res.add(new ArrayList<Integer>(al));
             
        }
       
        
        back(res,al,targetSum-root.val,root.left);
        back(res,al,targetSum-root.val,root.right);
        al.remove(al.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        back(res,al,targetSum,root);
        return res; 
    }
}