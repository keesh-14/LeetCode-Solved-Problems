class Solution {
    public int missingNumber(int[] nums) {
        int k = 1;
        int sum = 0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            sum = sum+ nums[i];
        }
        int req = n*(n+1)/2; 
        
            return req - sum;
        
    }
}