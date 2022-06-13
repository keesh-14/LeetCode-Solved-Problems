// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}

// } Driver Code Ends


class Solution {
    public void func(List<String> al,String ans,String S)
    {
        if(S.length()==0)
        {
            if(!al.contains(ans))
            al.add(ans);
            
            return;
        }        
        for(int i=0;i<S.length();i++)
        {
            String left = S.substring(0,i);
            String right = S.substring(i+1);
            func(al,ans+S.charAt(i),left+right);
           
        }
    }
    public List<String> find_permutation(String S) {
        List<String> res = new ArrayList<String>();
        func(res,"",S);
        Collections.sort(res);
        return res;
    }
}