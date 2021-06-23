class Solution {
    public int partition(int nums[],int l,int h)
    {
        int pivot = nums[h];
        int i = l-1;
        for(int j=l;j<=h-1;j++)
        {
            if(nums[j]>=pivot)
            {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int t = nums[i+1];
        nums[i+1]=nums[h];
        nums[h] = t;
        return i+1;
    }
    public int sort(int nums[],int k)
    {
        int l=0;
        int r = nums.length -1;
        while(l<=r)
        {
            int p=partition(nums,l,r);
            if(p==k-1)
                return nums[p];
            else if(p>k-1)
                r=p-1;
            else 
                l=p+1;
        }
        return nums[0];
    }
    public int findKthLargest(int[] nums, int k) {
        if(sort(nums,k)==-1)
            return -1;
        return sort(nums,k);
    }
}