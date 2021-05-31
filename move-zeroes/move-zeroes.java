class Solution {
    public void moveZeroes(int[] nums) {
        int i=nums.length - 1;
        int count = 0;
        
        while(i>=0)
        {
        
            if(nums[i]==0)
            {
                for(int k=i+1;k<nums.length;k++)
                {
                    nums[k-1]=nums[k];
                    
                }
                count++;
                
            }
                
            i--;
            
            
        }
        for(int x = nums.length - count;x<nums.length ;x++)
        nums[x] = 0;
    }
}