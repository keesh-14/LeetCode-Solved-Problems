class Solution {
    public int numTrees(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        int i=2;
        while(i<=n)
        {
            int j=0;
            int k=i-1;
            while(j<i)
            {
                dp[i] = dp[i] + dp[k] *dp[j];
                j++;
                k--;
                
            }
            i++;
        }
        return dp[n];
    }
}