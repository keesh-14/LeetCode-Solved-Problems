class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 1)
            return 1;
        int dp[] = new int[nums.length];
         dp[0] = 1;
        for(int i=1;i<nums.length;i++)
        {  
            int x =0;
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    x = Math.max(x,dp[j]);
                       
                }
            }
                dp[i] =x+1;
        }
        int max =0;
        for(int i=0;i<nums.length;i++)
        {
        max = Math.max(max,dp[i]);
        }
        return max; 
    }
}