class Solution {
    public int maxSubArray(int[] nums) {
        // int sum[]=new int[nums.length];
        int sum=nums[0];
        int ele=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            ele= Math.max(nums[i]+ele,nums[i]);
            sum = Math.max(ele,sum);
        }
        
        return sum;
    }
}