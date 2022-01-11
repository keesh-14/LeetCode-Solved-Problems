class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int m[] = new int[nums.length];
        m[0] = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            max = Math.max(nums[i]+max,nums[i]);
            m[i] = max;
        }
        max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max = Math.max(m[i],max);
        }
        return max;
    }
}