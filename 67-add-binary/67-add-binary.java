class Solution {
    public String addBinary(String a, String b) {
        
        String ans="";
        int c = 0;
            if(a.length()<b.length())
            {
                return addBinary(b, a);
            }
        int count = Math.abs(a.length()-b.length());
        while(count>0)
        {
           b = "0"+b;
            count--;
        }
        int j=b.length()-1;
        for(int i =a.length()-1;i>=0 && j>=0;i--)
        {
            if(a.charAt(i)=='1' && b.charAt(j)=='1')
            {
                if(c==0)
                {
                  ans = '0' + ans;
                  c=1;  
                }
                else if(c==1)
                {
                    ans = '1' + ans;
                    c = 1;
                }
            
            }
            else if(a.charAt(i)=='1' && b.charAt(j)=='0')
            {
                if(c==0)
                {
                  ans = '1' + ans;
                  c=0;  
                }
                else if(c==1)
                {
                    ans = '0'+ans;
                    c = 1;
                }
            
            }
            else if(a.charAt(i)=='0' && b.charAt(j)=='1')
            {
                if(c==0)
                {
                  ans = '1'+ans;
                  c=0;  
                }
                else if(c==1)
                {
                    ans = '0'+ans;
                    c = 1;
                }
            
            }
            else if(a.charAt(i)=='0' && b.charAt(j)=='0')
            {
                if(c==0)
                {
                  ans = '0'+ans;
                  c=0;  
                }
                else if(c==1)
                {
                    ans = '1'+ans;
                    c = 0;
                }
            
            }
            j--; 
                
        }
        
        if(c==1)
            ans = '1'+ans;
        return ans;
}
}