class Solution {
    public int expand(String s,int left,int right)
    {
        int count=0;
        if(s==null || left>right)
        {
            return 0;
        }
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
            count++;
        }
        return count;
    }
    public int countSubstrings(String s) {
        int n = s.length();
        if(s.length()==0)
            return 0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            int l1 = expand(s,i,i);
            int l2 = expand(s,i,i+1);
            count = count + l1 + l2;
        }
        return count;
    }
}