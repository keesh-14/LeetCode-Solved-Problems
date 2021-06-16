class Solution {
    public boolean back(char[][] board,String st,String word,int i,int j,int k,boolean vis[][])
    {
        
        if(word.length()==st.length())
            return true;
        if(i<0 || j<0 || i>board.length-1 || j>board[i].length-1 || vis[i][j]==true)
            return false;
        if(board[i][j]==word.charAt(k))
        {
            vis[i][j]=true;
            st = st + board[i][j];
            k++;
            if(back(board,st,word,i+1,j,k,vis) || back(board,st,word,i-1,j,k,vis) ||back(board,st,word,i,j-1,k,vis) || back(board,st,word,i,j+1,k,vis))
            return true;           
            vis[i][j] = false;
            st=st.substring(0,st.length()-1);
            k--;
           
        }
     
        
      return false;
        
        
    }
    public boolean exist(char[][] board, String word) {
        boolean vis[][] = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                    if(back(board,"",word,i,j,0,vis))
                        return true;
            }
        }
        return false ;
    }
}