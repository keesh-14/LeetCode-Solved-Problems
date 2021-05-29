class Solution {
    
    public int merge(int arr[],int temp[],int low,int mid,int high)
    {
        int i,j,k;
        int count =0;
        i=low;
        j=mid;
        k=low;
        
        while(i<=mid-1 && j<=high)
        {
            
            if(arr[i]>arr[j])
            {
                temp[k]=arr[j];
                k++;
                j++;
                 
            }
            else
            {
                temp[k]=arr[i];
                i++;
                k++;
                
            }
        }
        while(i<=mid -1)
        {
            temp[k]=arr[i];
            i++;
            k++;
            
        }
        while(j<=high)
        {
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(int x=low;x<=high;x++)
        arr[x]=temp[x];
        return count;
    }
    public int sort(int arr[],int temp[],int low,int high)
    {
        
        int count = 0;
        
        if(low<high)
        {
            int mid = (low + high)/2;
             count = count + sort(arr,temp,low,mid);
                 count = count + sort(arr,temp,mid+1,high);
            int j=mid+1;
              for(int i=low; i<=mid; i++)
            {
			    while(j<=high && arr[i]> 2L*arr[j]) 
                    j++;
                count+= j-mid-1;
            }
            merge(arr,temp,low,mid+1,high);
            
        }
        return count; 
    }
    public int reversePairs(int[] nums) {
        
        int temp[] = new int[nums.length];
        int count = sort(nums,temp,0,nums.length-1);
        return count;
        
        
    }
}