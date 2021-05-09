class Solution {
    public int findDuplicate(int[] nums) {
        int max = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            max = Math.max(max,nums[i]);
        }
        int arr[] = new int[max+1];
        Arrays.fill(arr,0);
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]++;
        }
        for(int i=0;i<=max;i++)
        {
            if(arr[i]>1)
                return i;
        }
        return -1;
    }
}