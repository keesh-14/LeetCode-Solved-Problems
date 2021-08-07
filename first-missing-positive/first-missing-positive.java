class Solution {
    public int firstMissingPositive(int[] nums) {
    int n  = nums.length;
        for(int i=0;i<n;i++)
        {
            
            if(nums[i]>0)
            {
             if(nums[i]>n || nums[i]==nums[nums[i]-1])
             {
                 
                continue;
                 
             }
             else 
             {
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
                 i--;
                
             }
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(i==nums[i]-1)
                continue;
            else 
                return i+1;
        }
         return n+1;
    }
}