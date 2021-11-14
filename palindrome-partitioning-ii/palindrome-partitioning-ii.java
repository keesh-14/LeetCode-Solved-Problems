class Solution {
    int t[][];
    public boolean isPal(String s,int i,int j)
    {
        if(i>=j)
            return true;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public int MCM(String s,int i,int j)
    {
        if(i>=j)
            return 0;
        if(isPal(s,i,j))
        {
            t[i][j] = 0;
            return 0;
        }
        if(t[i][j]!=-1)
            return t[i][j];
        int left = 0;
        int right = 0;
        int min = Integer.MAX_VALUE;
        int temp = 0;
        for(int k=i;k<=j-1;k++)
        {
            if(isPal(s,i,k))
            {
                temp = MCM(s,k+1,j) + 1;
            }
    
            min = Math.min(temp,min);
            
        }
        t[i][j] = min;
        return min;
    }
    public int minCut(String s) {
        t = new int[s.length()+1][s.length()+1];
        for(int x[] : t)
        {
            Arrays.fill(x,-1);
        }
       return  MCM(s,0,s.length()-1);    
    }
}