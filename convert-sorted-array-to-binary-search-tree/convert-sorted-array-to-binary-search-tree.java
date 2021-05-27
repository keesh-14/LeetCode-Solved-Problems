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
    public TreeNode binary(int low,int high,int nums[])
    {
        if(low>high)
            return null;
        if(low==high)
            return new TreeNode(nums[low]);
        int mid = (low+high)/2;
        TreeNode root = new TreeNode(nums[mid]);
        TreeNode left = binary(low,mid-1,nums);
        TreeNode right = binary(mid+1,high,nums);
        root.left = left;
        root.right = right;
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        
        return binary(0,nums.length-1,nums);
    }
}