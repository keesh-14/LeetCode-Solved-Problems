class Solution {
  
    public int recurse(int arr[],int d,int dp[],int index)
    {
        if(dp[index]!=-1)
            return dp[index];
        int count1 = 1;
        int count2 = 1;
        for(int i=index+1;i<arr.length && i<=index+d;i++)
        {
            if(arr[i]<arr[index])
                count1 = Math.max(recurse(arr,d,dp,i)+1,count1);
            else 
                break;
        }
        for(int i=index-1;i>=0 && i>=index-d;i--)
        {
            if(arr[i]<arr[index])
            count2 = Math.max(recurse(arr,d,dp,i)+1,count2);
            else 
                break;
        }
        dp[index] = Math.max(count1,count2);
        return Math.max(count1,count2);
        
    }
    public int maxJumps(int[] arr, int d) {
        int dp[] = new int[arr.length];
        Arrays.fill(dp,-1);
        int ans = 0;
        for(int i=0;i<arr.length;i++)
        {
            ans  = Math.max(ans,recurse(arr,d,dp,i));
        }
        return ans;
    }
}