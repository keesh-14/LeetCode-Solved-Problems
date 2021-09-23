class Solution {
    public String reverse(char s[])
    {
        String str ="";
        int low = 0;
        int high = s.length-1;
        while(low<=high)
        {
            char t = s[low];
            s[low] = s[high];
            s[high] = t;
            low++;
            high--;
        }
        for(char t : s)
        {
            str = str + t;
        }
        return str;
    }
    public int longestPalindromeSubseq(String s) {
        char c[] = new char[s.length()];
        c = s.toCharArray();
        String str = reverse(c);
        int dp[][] = new int[s.length()+1][str.length()+1];
        for(int i=0;i<s.length()+1;i++)
        {
            dp[i][0] = 0;
        }
        for(int i=0;i<str.length()+1;i++)
        {
            dp[0][i] = 0;
            
        }
        for(int i=1;i<s.length()+1;i++)
        {
            for(int j=1;j<str.length()+1;j++)
            {
                if(s.charAt(i-1)==str.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] + 1;
                else 
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[s.length()][str.length()];
    }
}