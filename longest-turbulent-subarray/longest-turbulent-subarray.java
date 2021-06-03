class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int k=2;
        int max=0;
        int flag = 0;
        if(arr.length == 1)
            return 1;
        // if(arr.length == 2 && arr[0]==arr[1])
        //     return 1;
        
            
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]==arr[i])
                continue;
            else 
                flag = 1;
        }
        if(flag != 1)
            return 1;
        if(arr.length==2)
            return 2;
        for(int i=1;i<arr.length-1;i++)
        {
            if((arr[i]<arr[i+1] && arr[i-1]>arr[i]) ||  (arr[i+1]<arr[i] && arr[i-1]<arr[i]))
                k++;
            else 
            {
                
               max = Math.max(k,max);
                k=2;
            }
           max =  Math.max(k,max);
        }
        return max;
        
    }
}