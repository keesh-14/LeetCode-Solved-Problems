class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text1.length()+1][text2.length()+1];
        for(int i=0;i<text1.length()+1;i++)
        {
            dp[i][0] = 0;
        }
        for(int i=0;i<text2.length()+1;i++)
        {
            dp[0][i] = 0;
        }
        for(int i=1;i<text1.length()+1;i++)
        {
            for(int j=1;j<text2.length()+1;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1]+1;
                else 
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        String s ="";
        int  i=text1.length();
        int  j=text2.length();
        while(i>0 && j>0)
        {
            if(text1.charAt(i-1)==text2.charAt(j-1))
            {
                i--;
                j--;
                s = s+text1.charAt(i);
            }
            else if(dp[i-1][j]>dp[i][j-1])
            {
                i--;
            }
            else 
                j--;
        }
        System.out.println(s);
        return dp[text1.length()][text2.length()];
    }
}