class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];
        int pre[] = new int[nums.length];
        int suff[] = new int[nums.length];
        pre[0] = 1;
        suff[nums.length-1] =1;
        for(int i=1;i<nums.length;i++)
        {
            pre[i] = nums[i-1] * pre[i-1];
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            suff[i] = nums[i+1] * suff[i+1];
        }
        for(int i=0;i<nums.length;i++)
        {
            arr[i] = pre[i] * suff[i];
        }
        return arr;
        
    }
}