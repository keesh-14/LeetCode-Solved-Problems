class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j = nums.length-1;
        int mid = 0;
        while(mid<=j)
        {
            if(nums[mid]==0)
            {
                int temp = nums[i];
                nums[i] = nums[mid];
                nums[mid] = temp;
                mid++;
                i++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else 
            {
                int temp = nums[j];
                nums[j] = nums[mid];
                nums[mid] = temp;
                j--;
            }
            
        }
    }
}