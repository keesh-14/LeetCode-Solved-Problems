class Solution {
    public int trap(int[] height) {
         int res = 0; 
        for(int j=1;j<height.length-1;j++)
        {
           int lmax=height[j];
         for(int i=0;i<j;i++)
         {
            lmax=Math.max(height[i],lmax);
         }
            int rmax = height[j];
            for(int i=j;i<height.length;i++)
            {
                rmax = Math.max(rmax,height[i]);
            }
            res = res + Math.min(lmax,rmax) - height[j];
        }
        return res;
        
    }
}