class Solution {
   public void solveSudoku(char[][] board) {
         boolean result = solve(board);
    }
    public boolean isSafe(char[][] board,int i,int j,char n)
    {
        for(int k=0;k<board.length;k++)
        {
            if(board[i][k]==n)
                return false;
            if(board[k][j]==n)
                return false;
        }
        int s = (int)Math.sqrt(board.length);
        int newi = i -(i%s);
        int newj = j - (j%s);
        for(int a=newi;a<newi+s;a++)
            for(int b=newj;b<newj+s;b++)
                if(board[a][b]==n)
                    return false;
        
        return true;
    }
    public boolean solve(char[][] board) {
       int i = 0;
       int j = 0; 
       boolean flag = false;
       for(i=0;i<board.length;i++)
       {
           for(j=0;j<board[i].length;j++)
           {
               if(board[i][j]=='.')
               {
                   flag = true;
                   break;
               }
           }
           if(flag)
               break;
       } 
       if(i==board.length && j==board[0].length)
           return true;
       for(int k=1;k<=9;k++)
       {
           if(isSafe(board,i,j,(char)(k+'0')))
           {
               board[i][j] =(char)(k+'0');
               if(solve(board))
                   return true;
               else 
                   board[i][j]='.';
           }
            
       }
       return false;

    }
}