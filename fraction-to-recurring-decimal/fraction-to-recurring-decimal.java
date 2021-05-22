class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
       StringBuilder str = new StringBuilder();
           if((numerator>0)^(denominator>0) && numerator!=0)
             str.append("-");
        
        long num = (long)Math.abs(numerator);
        long den = (long)Math.abs(denominator);
        long q = (long)Math.abs(num/den);
        long rem = (long)Math.abs(num%den);
        str.append(q);
        if(rem==0)
        return str.toString();
        str.append(".");
        
        HashMap<Long,Integer> hm = new HashMap<Long,Integer>();
        while(rem!=0)
        {
            if(hm.containsKey(rem))
            {
                str.insert(hm.get(rem),"(");
                str.append(")");
                break;
            }
            hm.put(rem,str.length());
            rem*=10;
            q=Math.abs(rem/den);
            rem = rem%den;
           str.append(q); 
        }
        return str.toString();
        
           
          
    }
    
}