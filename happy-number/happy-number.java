class Solution {
    HashSet<Integer> hs = new HashSet<Integer>();
    public boolean isHappy(int n) {
        
        if(n==1)
            return true;
        if(hs.contains(n))
            return false;
        else 
            hs.add(n);
        int c = n;
        int d=0;
        
            while(c>0)
            {
               
                d +=  (c%10) * (c%10);
                c=c/10;
            }
        
    
        return isHappy(d);
           
        
    }
}