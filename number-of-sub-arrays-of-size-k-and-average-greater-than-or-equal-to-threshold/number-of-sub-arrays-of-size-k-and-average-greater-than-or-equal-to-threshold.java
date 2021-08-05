class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        for(int i=0;i<k;i++)
        {
            sum = arr[i] + sum;
            
        }
        double s = sum/k;
        if(s>=threshold)
            count++;
         s= 0;
        for(int i=k;i<arr.length;i++)
        {
            sum = sum + arr[i] - arr[i-k];
          
                s = sum/k;
                if(s>=threshold)
                count++;
             
        
            
            
        }
        return count;
    }
}