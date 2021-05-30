class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return true;
        
        int x = 0;
        int y=0;
        while(y<t.length())
        {
            
            if(s.charAt(x)==t.charAt(y))
            {
                x++;
                if(x==s.length())
                    return true;
            }
            y++;
        }
        return false;
    
    }
}