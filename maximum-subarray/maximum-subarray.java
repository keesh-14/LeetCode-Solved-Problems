class Solution {
    public int maxSubArray(int[] nums) {
        // int sum[]=new int[nums.length];
         int sum = 0;
        int max =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum = Math.max(nums[i]+sum,nums[i]);
            max = Math.max(max,sum);
        }
        return max;
    }
}