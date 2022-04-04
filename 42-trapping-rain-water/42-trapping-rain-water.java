class Solution {
    public int trap(int[] height) {
       
        int leftMax = 0;
        int rightMax = 0;
        int left = 0;
        int right = height.length-1;
        int area = 0;
        while(left<right)
        {
            leftMax = Math.max(height[left],leftMax);
            rightMax = Math.max(height[right],rightMax);
            if(leftMax<rightMax)
            {
                area += leftMax - height[left];
                left++;
            }
            else if(leftMax>=rightMax)
            {
                area += rightMax - height[right];
                right--;
            }
            
           
        }
        return area;
    }
}