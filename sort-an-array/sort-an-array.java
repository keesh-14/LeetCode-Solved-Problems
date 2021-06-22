class Solution {
    public void merge(int nums[],int low,int high,int mid)
    {
        int n1=mid-low+1;
        int n2=high-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        int i=0;
        int j=0;
        int k=low;
        for(int x=0;x<n1;x++)
        {
            left[x]=nums[low+x];
        }
         for(int x=0;x<n2;x++)
        {
            right[x]=nums[mid+1+x];
        }
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            {
                nums[k]=left[i];
                i++;
                k++;
            }
            else 
            {
                nums[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<n1)
        {
            nums[k]=left[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            nums[k]=right[j];
            j++;
            k++;
        }
    }
    public void mergeSort(int nums[],int low,int high)
    {
        
        if(high>low)
        {
            int mid = (low+high)/2;
            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);
            merge(nums,low,high,mid);
        }
    }
    public int[] sortArray(int[] nums) {
      mergeSort(nums,0,nums.length-1);  
        return nums;
    }
}