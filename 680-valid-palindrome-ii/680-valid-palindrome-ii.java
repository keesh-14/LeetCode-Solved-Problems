class Solution {
    public boolean check(String s1)
    {
        int i = 0;
        int j = s1.length()-1;
        while(i<j)
        {
            if(s1.charAt(i)!=s1.charAt(j))
                return false;
            
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
       int i=0;
       int j=s.length()-1;
       while(i<j)
       {
           if(s.charAt(i)!=s.charAt(j))
           {
              break;
           }
           i++;
           j--;
           
       }
        if(i>j)
            return true;
       if(check(s.substring(i+1,j+1)) || check(s.substring(i,j)))
           return true;
       
        return false; 
         
    }
}