class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int i =0;
        int j = nums.length-1;
        int mid = 0;
        while(i<=j)
        {
            if(nums[mid]%2==0)
            {
                int temp = nums[mid];
                nums[mid] = nums[i];
                nums[i] = temp;
                mid++;
                i++;
            }
            else 
            {
                int temp = nums[mid];
                nums[mid]=nums[j];
                nums[j] = temp;
                j--;
            }
        }
        return nums;
    }
}