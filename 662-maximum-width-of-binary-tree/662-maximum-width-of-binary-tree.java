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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> pq = new LinkedList<TreeNode>();
        Queue<Long> val = new LinkedList<Long>();
        pq.add(root);
        val.add(0L);
        int ans = 0;
        while(!pq.isEmpty())
        {
            int  size = pq.size();
            long left = 0;
            long right = 0;
            for(int i=0;i<size;i++)
            {
                
                if(i==0)
                {
                    left = val.peek();
                    
                }
                if(i==size-1)
                {
                    right = val.peek();
                    
                }
                TreeNode curr = pq.poll();
                long value = val.poll();
                if(curr.left!=null)
                {
                    pq.add(curr.left);
                    val.add(value*2+1);
                }
                  if(curr.right!=null)
                {
                    pq.add(curr.right);
                    val.add(value*2+2);
                }
               
            }
            ans = (int)Math.max(ans,right-left+1);
            
        }
        return ans;
    }
}