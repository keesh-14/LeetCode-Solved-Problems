class Solution {
    public int minimumDeleteSum(String word1, String word2) {
         int dp[][] = new int[word1.length()+1][word2.length()+1];
        dp[0][0] = 0;
        for(int i=1;i<word1.length()+1;i++)
        {
            dp[i][0] = dp[i-1][0] + word1.charAt(i-1); 
        }
        for(int i=1;i<word2.length()+1;i++)
        {
            dp[0][i] = dp[0][i-1] + word2.charAt(i-1); 
        }
        for(int i=1;i<word1.length()+1;i++)
        {
            for(int j=1;j<word2.length()+1;j++)
            {
                if(word1.charAt(i-1)==word2.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1];
                }
                else 
                {
                    dp[i][j] = Math.min(dp[i-1][j]+(word1.charAt(i-1)),dp[i][j-1]+(word2.charAt(j-1)));
                }
                
            }
            
        }
        return  dp[word1.length()][word2.length()];
    
    }
}