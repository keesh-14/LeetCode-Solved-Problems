class Solution {
    public boolean isSafe(int mat[][],int row,int col)
    {
        for(int i=0;i<col;i++)
        {
            if(mat[row][i]==1)
                return false;
            
        }
        
        for(int i=row,j=col;i>=0 && j>=0;i--,j--)
        {
            if(mat[i][j]==1)
                return false;
            
        }
         
        for(int i=row,j=col;i<mat.length && j>=0;i++,j--)
        {
            if(mat[i][j]==1)
                return false;
        }
        return true;
            
    }
    public void solve(int mat[][],int col,int n,List<List<String>> res)
    {
        if(col==n)
        {
            ArrayList<String> al = new ArrayList<String>();
            for(int i=0;i<n;i++)
            {
                String s ="";
                for(int j=0;j<n;j++)
                {
                    s = s + (mat[i][j]==1?'Q':'.');
                }
                al.add(s);
            }
            res.add(al);
        }
        for(int i=0;i<n;i++)
        {
            if(isSafe(mat,i,col))
            {
                mat[i][col] = 1;
                solve(mat,col+1,n,res);
                mat[i][col] = 0;
                
            }
            
        }
            
    }
    public List<List<String>> solveNQueens(int n) {
        int mat[][] = new int[n][n];
        List<List<String>> res = new ArrayList<List<String>>();
        solve(mat,0,n,res);
        return res;
    }
}