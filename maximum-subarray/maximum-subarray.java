class Solution {
    public int maxSubArray(int[] nums) {
        int sum[]=new int[nums.length];
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sum[i]= Math.max(nums[i]+sum[i-1],nums[i]);
        }
        int max = sum[0];
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,sum[i]);
        }
        
        return max;
    }
}