class Solution {
    public int maxProfit(int[] prices) {
       int least = prices[0];
        int dp1[] = new int[prices.length];
        dp1[0] = 0;
        int mbst = 0;
        for(int i=1;i<prices.length;i++)
        {
            if(least>prices[i])
            {
                least = prices[i];
               
            }
            mbst  = prices[i] - least;
            dp1[i] = Math.max(dp1[i-1],mbst);
         
        }
        int mt = 0;
         int max = prices[prices.length-1];
        int dp2[] = new int[prices.length];
        dp2[prices.length-1] = 0;
        for(int i=prices.length-2;i>=0;i--)
        {
            if(max<prices[i])
            {
                max = prices[i];
                
            }
            mt = max-prices[i];
             dp2[i] = Math.max(dp2[i+1],mt);
        
        }
           
        int m =0;
        for(int i=0;i<prices.length;i++)
        {
            m = Math.max(dp1[i]+dp2[i],m);
        }
        return m;
    }
    
}