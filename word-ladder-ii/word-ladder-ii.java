class Solution {
    public boolean check(String s1,String s2)
    {
        int count = 0;
        for(int i=0;i<s1.length();i++)
        {
            
            if(s1.charAt(i)!=s2.charAt(i))
                count++;
            
            if(count>1)
                return false;
        }
        return true;
    }
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList)
    {
        if(wordList.contains(beginWord))
          wordList.remove(beginWord);
        List<List<String>> res = new ArrayList<List<String>>();
        Queue<String> q = new LinkedList<String>();
        boolean vis[] = new boolean[wordList.size()];
        q.add(beginWord);
        int count = 1;
        HashMap<String,List<String>> adj = new HashMap<String,List<String>>();
        aa:
        while(!q.isEmpty())
        {
            int c = q.size();
             ArrayList<Integer> al = new ArrayList<Integer>();
            List<String> t = new ArrayList<String>();
            for(int j =0;j<c;j++)
            {
            
                String curr = q.poll();
                adj.put(curr,new ArrayList<String>());
                if(endWord.equals(curr))
                    break aa;
               
                for(int i=0;i<wordList.size();i++)
                {
                    if(vis[i]!=true)
                    {
                        if(check(curr,wordList.get(i)))
                        {
                            List<String> temp = adj.get(curr);
                            temp.add(wordList.get(i));
                            q.add(wordList.get(i));
                             adj.put(curr,new ArrayList<String>(temp));
                            if(!wordList.get(i).equals(endWord))
                            al.add(i);
                        }
                    }
                }
                
            }
                for(int i:al)
                {
                    vis[i] = true;
                }
            count++;
            
        }
        System.out.println(count);
        List<String> m = new ArrayList<String>();
        DFS(res,m,beginWord,endWord,count-1,adj);
        return res;
  }
   public void DFS(List<List<String>> res,List<String> al,String start,String end,int count,HashMap<String,List<String>> adj)
   {
       if(count==0)
       {
           if(start.equals(end))
           {
               al.add(end);
               res.add(new ArrayList<String>(al));
               al.remove(end);
           }
           return;
       }
    
       al.add(start);
       List<String> s = adj.get(start);
       for(String x : adj.get(start))
       {
           DFS(res,al,x,end,count-1,adj);
           
       }
        al.remove(start);   
       
    }
}