class Solution {
    public int isSubset(int nums[],int target)
    {
        int dp[][] = new int[nums.length+1][target+1];
        for(int i=0;i<nums.length+1;i++)
        {
            dp[i][0] = 1;
        }
        for(int i=1;i<target+1;i++)
        {
            dp[0][i] = 0; 
        }
        for(int i=1;i<nums.length+1;i++)
        {
            for(int j=0;j<target+1;j++)
            {
                if(nums[i-1]<=j)
                {
                    dp[i][j] = dp[i-1][j-nums[i-1]] + dp[i-1][j];
                }
                else 
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[nums.length][target];
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum = sum + nums[i];
        }
        int  t = sum + target;
         if(sum < target || -sum>target)
           return 0;
        if(t%2!=0)
            return 0;
       return isSubset(nums,(target+sum)/2);
    }
}