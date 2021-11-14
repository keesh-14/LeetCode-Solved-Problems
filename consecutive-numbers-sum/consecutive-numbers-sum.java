class Solution {
    public double cal(int n,int k)
    {
        double nume = (2*n - k*k - k);
        double deno = 2*k+2;
        return nume/deno;
    }
    public int consecutiveNumbersSum(int n) {
        int k = 0;
        int count = 0;
        while(true)
        {
             double val = cal(n,k);
             if(val<=0)
                 break;
            if(val - (int)val == 0.0)
            {
              count++;
            }
            k++;
        }
        return count;
        
    }
}