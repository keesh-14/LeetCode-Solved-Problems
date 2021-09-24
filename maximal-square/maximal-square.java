class Solution {
    public int maximalSquare(char[][] matrix) {
       int dp[][]  = new int[matrix.length+1][matrix[0].length+1];
       int res = 0;
        for(int i=1;i<matrix.length+1;i++)
        {
           for(int j=1;j<matrix[0].length+1;j++)
           {
               if(matrix[i-1][j-1]=='0')
                   continue;
               dp[i][j] = Math.min(Math.min(dp[i][j-1],dp[i-1][j-1]),dp[i-1][j]) +1;
               res = Math.max(dp[i][j],res);
           }
        }
        return res*res;
    }
}