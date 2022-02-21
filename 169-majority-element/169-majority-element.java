class Solution {
    public int majorityElement(int[] nums) {
        int a = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++)
        {
               if(nums[i]==a)
               {
                   count++;
               }
               else 
               {
                   count--;
               }
            
            if(count==0)
            {
                a = nums[i];
                count = 1;
            }
            
        }
        count=0;
      for(int i=0;i<nums.length;i++)
      {
          if(nums[i]==a)
              count++;
      }
          
        if(nums.length/2<count)
            return a;
        return -1;
    }
}