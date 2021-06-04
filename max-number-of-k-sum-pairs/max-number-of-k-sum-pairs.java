class Solution {
    public int maxOperations(int[] nums, int k) {
          Arrays.sort(nums);
        int i=0;
        int count =0;
        int j=nums.length-1;
        int a[] = new int[nums.length];
        while(i<j)
        {
            if(nums[i]+nums[j]==k)
            {
                count++;
                i++;
                j--;
            }
            else if(nums[i]+nums[j]>k)
                j--;
            else 
                i++;
        }
        return count;
    }
}