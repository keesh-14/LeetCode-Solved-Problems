class Solution {

    public String findCommon(String s1,String s2)
    {
        String res = "";
        int i=0;
        int j=0;
        while(s1.length()>i && s2.length()>j && s1.charAt(i)==s2.charAt(j))
        {
            res = res + s1.charAt(i);
        
            i++;
            j++;
        }    
        return res;
    }
    public String longestCommonPrefix(String[] strs) {
       String res = strs[0];
       for(int i=1;i<strs.length;i++)
       {
           res = findCommon(res,strs[i]);
       }
        return res;
    }
}