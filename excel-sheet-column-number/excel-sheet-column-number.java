class Solution {
    public int titleToNumber(String columnTitle) {
        // int x =0;
        // if(columnTitle.length()==1)
        // {
        //   x = (int )columnTitle.charAt(0)-'A'+1;
        //     return x;
        // }
       // String s = columnTitle.substring(0,columnTitle.length()-1);
        int k=0;
        int curr =0;
        for(int i=columnTitle.length()-1;i>=0;i--)
        {
           k += ((int)Math.pow(26,curr++)) * ((int)columnTitle.charAt(i)-'A'+1);
        }
        return k;
    }
}