class Solution {
    public boolean detectCapitalUse(String word) {
        boolean flag = true;
        int count = 0;
        for(int i=0;i<word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i)) && flag == true)
            {
                             
                count++;
                
            }
            else if(Character.isUpperCase(word.charAt(i)))
            {
        
                count++;
                
            }
            else 
            {
                flag = false;
            }
            
            
        }
        if(flag == false && count==1 && Character.isUpperCase(word.charAt(0)))
            return true;
        else if(flag == true && count==word.length())
            return true;
        else if(count==0)
            return true;
        
        return false;
    }
}