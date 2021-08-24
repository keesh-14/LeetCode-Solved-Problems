class Solution {
    public boolean isRobotBounded(String instructions) {
        int x=0;
        int y=0;
        String dir = "N";
        for(int i=0;i<instructions.length();i++)
        {
            if(instructions.charAt(i)=='G')
            {
                if(dir=="N")
                {     
                  y++;
                }
                else if(dir=="S")
                {
                    y--;
                }
                else if(dir=="E")
                {
                    x++;
                }
                else if(dir=="W")
                {
                    x--;
                }
                
            }
            else if(instructions.charAt(i)=='L')
            {
                if(dir=="N")
                {     
                  dir="W";
                }
                else if(dir=="S")
                {
                    dir="E";
                }
                else if(dir=="E")
                {
                    dir="N";
                }
                else if(dir=="W")
                {
                    dir="S";
                }
            }
            else 
            {
                if(dir=="N")
                {     
                  dir="E";
                }
                else if(dir=="S")
                {
                    dir="W";
                }
                else if(dir=="E")
                {
                    dir="S";
                }
                else if(dir=="W")
                {
                    dir="N";
                }
                
            }
    
        }
        if(x==0 && y==0)
            return true;
        if(dir=="N")
            return false;
        return true;
    }
}