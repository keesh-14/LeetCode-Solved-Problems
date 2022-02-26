// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S1[] = read.readLine().split(" ");
            String S2[] = read.readLine().split(" ");
            int[] start = new int[N];
            int[] end = new int[N];
            
            for(int i=0; i<N; i++)
            {
                start[i] = Integer.parseInt(S1[i]);
                end[i] = Integer.parseInt(S2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxEvents(start,end,N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int maxEvents(int[] start, int[] end, int N) {
      
        int mat[][] = new int[N][2];
        for(int i=0;i<N;i++)
        {
            mat[i][0]= start[i];
            mat[i][1] = end[i];
            
        }
        Arrays.sort(mat,(t1,t2) -> t1[0]-t2[0]);
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        int day=0;
        int count=0;
        int i=0;
        while(i<N || !q.isEmpty())
        {
            if(q.isEmpty())
            day = mat[i][0];
            while(i<N && day==mat[i][0])
            {
                q.add(mat[i][1]);
                i++;
            }
            day++;
            count++;
            q.poll();
            while(!q.isEmpty() && q.peek()<day)
            q.poll();
        }
       
        return count;
    
        
    }
}