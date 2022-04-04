// { Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}


// } Driver Code Ends


class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    public static int kadens(int a[],int n,boolean isNormal)
    {
        long sum = 0;
        long max = 0;
        int i=0;
        if(isNormal){
            sum=Integer.MIN_VALUE;
            max=Integer.MIN_VALUE;
        }else{
            sum=a[0];
            max=a[0];
            i=1;
        }
        for(;i<n;i++)
        {
            max = Math.max(a[i],a[i]+max);
            sum = Math.max(sum,max);
        }
        return (int)sum;
    }
    static int circularSubarraySum(int a[], int n) {
        // Your code here
       int normal =  kadens(a,n,true);
       if(normal<0)
       return normal;
       int s = 0;
       for(int i=0;i<n;i++)
       {
           s += a[i]; 
           a[i] = -a[i];
           
       }
       int circular = kadens(a,n,false);
       int mx = Math.max(normal,s+circular);
       return mx;
        
    }
    
}

