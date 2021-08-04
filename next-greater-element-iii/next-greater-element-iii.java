class Solution {
    public void reverse(int arr[],int low)
    {
        if(low==arr.length)
            return;
        int i = low;
        int j = arr.length-1;
        while(j>=i)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public int nextGreaterElement(int n) {
        int k = n;
        int count = 0;
        while(k>0)
        {
            k = k/10;
            count++;
        }
        
        int arr[]=new int[count];
        k=n;
        int j = count -1;
        while(k>0)
        {
            arr[j] =  k%10;
            k = k/10;
            j--;
        }
        int i= count -2;
        while(i>=0 && arr[i]>=arr[i+1])
        {
            
            i--;
        }
        if(i==-1)
            return -1;
        j = count-1;
        while(arr[j]<=arr[i])
        {
            j--;
            
        }
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        reverse(arr,i+1);
        String c="";
        i = 0;
        while(i<count)
        {
            c = c + arr[i];
            i++;
        }
        
        try{
            if(n==Integer.parseInt(c))
                return -1;
            return Integer.parseInt(c);
        }
        catch(Exception e)
        {
            return -1;
        }
    }
}