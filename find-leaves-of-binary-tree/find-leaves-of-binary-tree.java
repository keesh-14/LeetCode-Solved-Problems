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
    List<List<Integer>> ls;
    public int getHeight(TreeNode root){
        if(root==null){
            return -1;
        }

        int leftH = getHeight(root.left);
        int rightH = getHeight(root.right);

        int currentHeight = Math.max(leftH, rightH) + 1;
        if(currentHeight==ls.size()){
            ls.add(new ArrayList<>());
        }

        ls.get(currentHeight).add(root.val);
        return currentHeight;
    }

    public List<List<Integer>> findLeaves(TreeNode root) {
        ls = new ArrayList<List<Integer>>();
        getHeight(root);
        return ls;
    }
}