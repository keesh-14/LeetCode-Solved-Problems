class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int dp[][] = new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<str1.length()+1;i++)
        {
            dp[i][0] = 0;
        }
        for(int j=0;j<str2.length()+1;j++)
        {
            dp[0][j] = 0;
        }
        for(int i=1;i<str1.length()+1;i++)
        {
            for(int j=1;j<str2.length()+1;j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] +1;
                else 
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        int i=str1.length();
        int j=str2.length();
        String s  = "";
        while(i>0 && j>0)
        {
            if(str1.charAt(i-1)==str2.charAt(j-1))
            {
                s = s + str1.charAt(i-1);
                j--;
                i--;
            }
            else if(dp[i-1][j]>dp[i][j-1])
            {
                s = s + str1.charAt(i-1); 
                i--;
            }
            else 
            {
                s = s + str2.charAt(j-1); 
                j--;
  
            }
        }
        while(i>0)
        {
            s = s + str1.charAt(i-1); 
                i--;
        }
        while(j>0)
        {
             s = s + str2.charAt(j-1); 
                j--;
  
        }
        char c[] = new char[s.length()];
        c = s.toCharArray();
        i = 0;
        j = s.length()-1;
        while(i<j)
        {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        String str = "";
        for(char t:c)
        {
            str = str + t;
        }
        return str;
    }
    
}