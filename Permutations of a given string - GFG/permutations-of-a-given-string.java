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
    public void func(List<String> al,String ans,String S,boolean vis[])
    {
        if(S.length()==ans.length())
        {
            if(!al.contains(ans))
            al.add(ans);
            
            return;
        }        
        for(int i=0;i<S.length();i++)
        {
            if(vis[i] == false)
            { 
                vis[i] = true;
                ans += S.charAt(i); 
                func(al,ans,S,vis);
                vis[i]= false;
                ans = ans.substring(0,ans.length()-1);
           
            }
            
        }
    }
    public List<String> find_permutation(String S) {
        List<String> res = new ArrayList<String>();
        boolean vis[]= new boolean[S.length()];
        func(res,"",S,vis);
        Collections.sort(res);
        return res;
    }
}