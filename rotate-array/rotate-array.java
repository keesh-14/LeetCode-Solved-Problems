class Solution {
    public void reverse(int i,int j,int nums[])
    {
        while(i<=j)
        { 
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        if(nums.length==1 || nums.length==0)
            return;
            if(nums.length<k)
                k = k%nums.length;
       reverse(0,nums.length-1,nums);
         reverse(0,k-1,nums);
        reverse(k,nums.length-1,nums);
        
        
        
            
    }
}