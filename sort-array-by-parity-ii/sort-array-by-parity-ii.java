class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int arr[] = new int[nums.length];
        int j=1;
        int k=0;
        while(k<nums.length)
        {
            if(nums[k]%2==0)
            {
                arr[i]=nums[k];
                k++;
                i=i+2;
            }
            else 
            {
                arr[j]=nums[k];
                k++;
                j=j+2;
            }
        }
        return arr;
    }
}