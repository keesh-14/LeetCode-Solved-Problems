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
    public List<TreeNode> allPossibleFBT(int n) {
        return helper(n);
    }
    public List<TreeNode> helper(int n)
    {
        List<TreeNode> ans = new ArrayList<TreeNode>();
        if(n==1)
        {
            List<TreeNode> ls = new ArrayList<TreeNode>();
            TreeNode temp = new TreeNode(0);
            ls.add(temp);
            return ls;
        }
        for(int  i=1;i<n;i++)
        {
            List<TreeNode> l = helper(i);
            List<TreeNode> r = helper(n-i-1);
            for(TreeNode right : r)
            {
                for(TreeNode left : l)
                {
                    TreeNode curr = new TreeNode(0); 
                    curr.left = left;
                    curr.right = right;
                    ans.add(curr);
                }
            }
           
        }
        return ans;
    }
}