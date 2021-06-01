class Solution {
    public void solve(char[][] board) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='O' && (i==0 || j==0 || j==board[0].length-1 || i==board.length-1))
                {
                    DFS(i,j,board);
                    
                }
            }
        }
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='$')
                    board[i][j]='O';
                else if(board[i][j]=='O')
                    board[i][j]='X';
            }
        }
    }
    public void DFS(int i,int j,char[][] board)
    {
        if(i<0 || j<0 || j>=board[0].length || i>=board.length || board[i][j]=='X' || board[i][j]=='$')
        {
            return;
        }
            board[i][j]='$';
            DFS(i+1,j,board);
            DFS(i-1,j,board);
            DFS(i,j-1,board);
            DFS(i,j+1,board);
        
    }
}