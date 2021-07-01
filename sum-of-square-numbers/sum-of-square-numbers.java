class Solution {
    public boolean judgeSquareSum(int c) {
        int low =0;
        int right = (int)Math.sqrt(c);
        while(low<=right)
        {
            if((low*low + right * right)==c)
                return true;
            else if((low*low + right * right)<c)
                low++;
            else 
                right--;
            
        }
        return false;
    }
}