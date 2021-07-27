class Solution {
    public void reverse(int low,int high,int nums[])
    {
        int i=low;
        int j=high;
        while(i<=j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        
    }
    public void rotate(int[] nums, int k) {
   
        k = k%nums.length;
        reverse(0,nums.length-1,nums); 
        reverse(0,k-1,nums);
        reverse(k,nums.length-1,nums);
       
    }
}