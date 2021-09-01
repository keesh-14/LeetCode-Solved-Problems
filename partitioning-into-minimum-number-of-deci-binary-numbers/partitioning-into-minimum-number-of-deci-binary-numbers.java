class Solution {
    public int minPartitions(String n) {
        int s =Integer.MIN_VALUE;
        for(int i=0;i<n.length();i++)
        {
            int m  = n.charAt(i)-'0';
            if(s<m)
            {
                s = m; 
            }
        }
        return s;
    }
}