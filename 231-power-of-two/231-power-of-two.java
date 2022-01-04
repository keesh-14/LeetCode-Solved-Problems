class Solution {
    public boolean isPowerOfTwo(int n) {
        long x = n;
        if(x==0)
            return false;
        return (0==(x & x-1))?true:false;
    }
}