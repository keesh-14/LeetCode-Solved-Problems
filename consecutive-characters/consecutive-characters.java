class Solution {
    public int maxPower(String s) {
        int count = 0;
        int max = 0;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                count++; 
            }
            else 
            {
                count = 0;
            }
            max = Math.max(max,count);
        }
       
        return max+1;
    }
}