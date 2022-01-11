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
    List<String> al = new ArrayList<String>();
    String ans ="";
    public void sum(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            ans +=  String.valueOf(root.val);
            al.add(ans);
            ans = ans.substring(0,ans.length()-1);
            return;
        }
        ans +=  String.valueOf(root.val);
        sum(root.left);
        sum(root.right);
        ans = ans.substring(0,ans.length()-1);
    }
    public int binary(String s)
    {
        int i=0;
        int pow = s.length()-1;
        int num = 0;
        while(i<s.length())
        {
            num = num*2 + (int)(s.charAt(i)-'0');
            pow--;
            i++;
        }
        return num;
        
    }
    public int sumRootToLeaf(TreeNode root) 
    {
       sum(root);
       int sum = 0;
       for(int i=0;i<al.size();i++)
       {
          sum += binary(al.get(i));
       }
       return  sum;
    }
}