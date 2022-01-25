class Solution {
    public boolean validMountainArray(int[] arr) {
        int i=0;
        for(i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                break;
            }
            else if(arr[i]==arr[i-1])
            {
                return false;
            }
          
        }
        if(i==1 || i==arr.length)
            return false;
        for(;i<arr.length;i++)
        {
             if(arr[i]>=arr[i-1])
                 break;
            
        }
        if(i==arr.length)
            return true;
        
        return false;
        
        
    }
}