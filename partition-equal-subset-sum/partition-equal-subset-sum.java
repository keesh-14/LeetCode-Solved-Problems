class Solution {
    public boolean isSubset(int s1,int nums[])
    {
        boolean dp[][] = new boolean[nums.length+1][s1+1];
        for(int i=1;i<s1+1;i++)
        {
            dp[0][i]=false;
        }
        for(int i=0;i<nums.length+1;i++)
        {
            dp[i][0] = true;
        }
        for(int i=1;i<nums.length+1;i++)
        {
            for(int j=1;j<s1+1;j++)
            {
                if(j>=nums[i-1])
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                else 
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[nums.length][s1];
        
    }
    public boolean canPartition(int[] nums) {
       int s = 0;
        if(nums.length == 1)
            return false;
        for(int i=0;i<nums.length;i++)
        {
            s = nums[i] + s;
        }
        if(s%2!=0)
            return false;
        int s1 = s/2;
        if(isSubset(s1,nums))
            return true;
        else 
             return false;
    }
}