class Solution {
    
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        int n = columnTitle.length()-1;
        for(int i=0;i<columnTitle.length();i++)
       {
           sum += (columnTitle.charAt(i) - 'A' + 1)*Math.pow(26,n);
           n--;  
       }
       return sum;
    }
}