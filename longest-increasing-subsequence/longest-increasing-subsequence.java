class Solution {
    public int lengthOfLIS(int[] nums) {
    if(nums.length == 1)
        return 1;
        int dp[] =  new int[nums.length];
        dp[0] = 1;
        int max =0;
        for(int i=1;i<nums.length;i++)
        {
            max=0;
            for(int j=0;j<i;j++)
            {
                
                if(nums[j]<nums[i])
                {
                    max = Math.max(dp[j],max);
                    
                }
                
            }
            dp[i] = 1 + max;
            
                
        }
        int m=0;
        for(int i=0;i<nums.length;i++)
        {
            m = Math.max(m,dp[i]);
        }
        return m;
        
        
        
    }
}