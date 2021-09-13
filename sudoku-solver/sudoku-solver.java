class Solution {
    public boolean isSafe(char[][] board,char k,int i,int j)
    {
        for(int x = 0;x<board.length;x++)
        {
            if(board[x][j]==k || board[i][x]==k)
                return false;
        }
        int s =(int )Math.sqrt(board.length);
        int sr = i - i%s;
        int sc = j - j%s;
        for(int a = 0;a<s;a++)
        {
            for(int b = 0;b<s;b++)
            {
                if(board[a+sr][b+sc]==k)
                    return false;
            }
        }
        return true;
    }
   public void solveSudoku(char[][] board) {
         boolean result = solve(board);
    }
    public boolean solve(char[][] board) {
       int n = board.length;
        int i =0;
        int j =0;
        boolean flag = false;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(board[i][j]=='.')
                {
                    flag = true;
                    break;
                }
                
            }
            if(flag==true)
                break;
        }
        if(i==n && j==n)
            return true;
        for(int k = 1;k<=9;k++)
        {
            char c = (char)(k +'0');
            if(isSafe(board,c,i,j))
            {
                board[i][j] = (char)(k +'0');
                if(solve(board))
                    return true;
                board[i][j] = '.'; 
                
            }
            
        }
        
       return false; 
    }
}