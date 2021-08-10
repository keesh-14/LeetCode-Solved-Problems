class Solution {
    public int longestOnes(int[] nums, int k) {
       int start = 0;
        int max = 0;
        int count = 0;
        int i= 0;
        while(i<nums.length)
        {
            
            
            if(nums[i]==0)
                count++;
            if(count>k)
            {
                while(nums[start]!=0)
                {
                    start++;
                    
                }
                start++;
                count--;
                
            }
            max = Math.max(i-start+1,max);
            i++;
        }
        return max;
    }
}