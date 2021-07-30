class Solution {
    public boolean isMatch(String s, String p) {
       boolean dp[][] = new boolean[s.length()+1][p.length()+1];
        dp[0][0]=true;
        int i =0;
        int j=0;
        for( i=1;i<=s.length();i++)
        {
            dp[i][0] = false;
        }
        for(i=1;i<=p.length();i++)
        {
              if(p.charAt(i-1)=='*')
                dp[0][i]=dp[0][i-1];
              else
                dp[0][i]=false;
         }
        
        for(i=1;i<=s.length();i++)
        {
            for(j=1;j<=p.length();j++)
            {
                if(p.charAt(j-1) =='*')
                     dp[i][j]=(dp[i-1][j] || dp[i][j-1]);
                  else if(p.charAt(j-1)=='?')
                     dp[i][j] = dp[i-1][j-1];
                 else if(s.charAt(i-1)==p.charAt(j-1))
                     dp[i][j]=dp[i-1][j-1];
                 else 
                    dp[i][j]=false;
             }
        }
        return dp[s.length()][p.length()];
}
}