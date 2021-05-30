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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        if(root == null)
            return al;
        TreeNode curr = root;
        st.add(root);
            while(!st.isEmpty())
            {
                TreeNode temp = st.pop();
                s.add(temp);
                if(temp.left!=null)
                st.add(temp.left);
                if(temp.right!=null)
                    st.add(temp.right);
               
            }
        
        while(!s.isEmpty())
        {
            TreeNode t = s.pop();
            al.add(t.val);
                
        }
        return al;
            
            
        

            
    }
}