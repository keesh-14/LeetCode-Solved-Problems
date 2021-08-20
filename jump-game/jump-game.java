class Solution {
    public boolean canJump(int[] nums) {
          int count = 0;
        if(nums.length==1)
            return true;
        int max = 0;
          for(int i=0;i<nums.length;i++)
          {
              if(max<i)
                  return false;
              max =  Math.max(nums[i]+i,max);
            
          }
        if(max>=nums.length-1)
            return true;
            
       
        return false;
        
    }
}