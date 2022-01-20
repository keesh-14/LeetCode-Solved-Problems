class Solution {
    
    public int minEatingSpeed(int[] piles, int k) {
       int l = 1;
        int max = 0;
        int res = Integer.MAX_VALUE;
       for(int i=0;i<piles.length;i++)
       {
           max = Math.max(piles[i],max);
       }
        
       int h = max;
       while(l<=h)
       { 
           int mid = h - (h-l)/2;
           int ans = 0;
           for(int i=0;i<piles.length;i++){
               ans += Math.ceil(piles[i]/(double)mid);
               
               
           }
           if(ans<=k)
           {
               res = Math.min(res,mid);
               h = mid - 1;
           }
           else 
           {
               l = mid + 1;
           }
           
        }
        return res;
        
    }
}