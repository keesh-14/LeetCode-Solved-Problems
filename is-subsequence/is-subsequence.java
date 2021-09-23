class Solution {
    public boolean isSubsequence(String s, String t) {
        int dp[][] = new int[s.length()+1][t.length()+1];
        for(int i=0;i<s.length()+1;i++)
        {
            dp[i][0] = 0;
        }
        for(int i=0;i<t.length()+1;i++)
        {
            dp[0][i] = 0;
        }
        for(int i=1;i<s.length()+1;i++)
        {
            for(int j =1;j<t.length()+1;j++)
            {
                if(s.charAt(i-1)==t.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1]+1;
                else 
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        
        if(s.length()==dp[s.length()][t.length()])
            return true;
        return false;
    
    }
}