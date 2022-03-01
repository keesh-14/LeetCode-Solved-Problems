// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


 // } Driver Code Ends
        


// Solution class to implement function largestAndSecondLargest
class Solution{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<sizeOfArray;i++)
        {
            if(max<arr[i]  && arr[i]!=max )
            {
                sMax = max;
                max = arr[i];
                
            }
            else if(sMax<arr[i] && arr[i]!=max)
            {
                sMax = arr[i];
            }
            
        }
        if(max == Integer.MIN_VALUE)
        al.add(-1);
        else 
        al.add(max);
        if(sMax == Integer.MIN_VALUE)
        al.add(-1);
        else 
        al.add(sMax);
        return al;
    }
}

// { Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    
		    int arr[] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int index = 0;index < sizeOfArray; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution obj = new Solution();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		    res = obj.largestAndSecondLargest(sizeOfArray, arr);
		    System.out.println(res.get(0) + " " + res.get(1) );
		}
	}
}  // } Driver Code Ends