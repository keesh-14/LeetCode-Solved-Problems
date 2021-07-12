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
    TreeNode root = null;
    int index = 0;
    public TreeNode makeTree(int in[],int pre[],int is,int ie)
    {
        if(is>ie || index==pre.length)
            return null;
         
         TreeNode root = new TreeNode(pre[index++]);
        int ind=0;
        for(int i=is;i<=ie;i++)
        {
            if(in[i]==root.val)
            {
                ind = i;
                break;
            }
        }
        root.left = makeTree(in,pre,is,ind-1);
        root.right = makeTree(in,pre,ind+1,ie);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {

         root = makeTree(inorder,preorder,0,inorder.length-1);
        return root;
    }
}