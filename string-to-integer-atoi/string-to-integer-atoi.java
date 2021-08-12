class Solution {
    public int myAtoi(String s) {
      
        String c = s.trim();
        if(c.length()==0)
           return 0;
           
        String st = "";
        int x = c.length();
        int i=0;
        char str =' ';
        if(c.charAt(i)=='-')
        {
            str =  '-';
            i++;
        }
        else if(c.charAt(i)=='+')
        {
            str = '+';
            i++;
        }
        while(i<c.length() && c.charAt(i)=='0')
        {
            i++;
        }
  
        while(x>i && Character.isDigit(c.charAt(i)))
        {
            st = st + c.charAt(i);
            i++;
        }
        if(st.length()==0)
            return 0;
        int k = st.length();
        int j=0;
        int n=0;
   
        if(k>10)
        {
          if(str=='-')
          {
              return Integer.MIN_VALUE;
              
          }
            else 
            {
                return Integer.MAX_VALUE;
            }
        }
        
        while(j<k)
        {
           if((j==9 && n>Integer.MAX_VALUE/10)|| j>10)
           {
               if(str=='-')
                   return Integer.MIN_VALUE;
               else 
                   return Integer.MAX_VALUE;
           }
           if(j==9 && n==Integer.MAX_VALUE/10)
           {
                   if(str=='-')
                   {
                       if(st.charAt(9)-'0'>=8)
                           return Integer.MIN_VALUE;
                       
                   }
                  else 
                  {
                      if(st.charAt(9)-'0'>=7)
                          return Integer.MAX_VALUE;
                  }
                      
            }

            n = n*10 + (int)st.charAt(j)-'0';
            j++;
           
        }
        if(str=='-')
            n = -n;
      
        
        
        return n;
    }
}