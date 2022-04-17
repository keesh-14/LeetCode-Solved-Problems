/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
List<TreeNode> res =  new ArrayList<TreeNode>();
    public boolean find(TreeNode root,TreeNode target)
    {
        if(root==null)
        {
            return false;
        }
        if(root==target)
        {
            res.add(root);
            return true;
        }
        boolean left = find(root.left,target);
        if(left==true)
        {
            res.add(root);
            return true;
        }
        boolean right = find(root.right,target);
        if(right==true)
        {
            res.add(root);
            return true;
        }
        return false;
    }
    public void Kdis(List<Integer> al,TreeNode root,int k,TreeNode blocker)
    {
        if(root==null || k<0 || root == blocker)
        {
            return;
        }
        if(k==0)
        {
            al.add(root.val);
            
        }
        Kdis(al,root.left,k-1,blocker);
        Kdis(al,root.right,k-1,blocker);
        
        
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> al = new ArrayList<Integer>();
        find(root,target);
       // Collections.reverse(res);
        for(int i=0;i<res.size();i++)
        {
            Kdis(al,res.get(i),k-i,i==0?null:res.get(i-1));
        }
        return al;
    }
}