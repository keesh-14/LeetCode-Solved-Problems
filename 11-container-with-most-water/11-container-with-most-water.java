class Solution {
    public int maxArea(int[] height) {
       int i= 0;
        int n = height.length;
        int j = n-1;
        int res = 0;
        while(i<j)
        {
            if(height[i]<height[j])
            {
              res = Math.max(height[i]*(j-i),res);
               i++;
            }
            else 
            {
              res = Math.max(height[j]*(j-i),res);
               j--;
                
            }
        }
        return res;
    }
}