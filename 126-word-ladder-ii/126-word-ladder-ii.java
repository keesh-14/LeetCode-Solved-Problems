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
    public int BFS(String beginWord,String endWord,List<String> wordList,HashMap<String,List<String>> hm)
    {
          if(wordList.contains(beginWord))
          {
              wordList.remove(beginWord);
          }
          Queue<String> q = new LinkedList<String>();
          boolean vis[] = new boolean[wordList.size()];
          q.add(beginWord);
          int count = 0;
          while(!q.isEmpty())
          {
              int size  = q.size();
              HashSet<Integer> hs = new HashSet<Integer>();
              for(int i=0;i<size;i++)
              {
                  String curr = q.poll();
                  if(!hm.containsKey(curr))
                  {
                      hm.put(curr,new ArrayList<String>());
                  }
                  else 
                  {
                      continue;
                  }
                  if(curr.equals(endWord))
                      return count;
                  for(int j=0;j<wordList.size();j++)
                  {
                      if(vis[j]!=true)
                      {
                          if(check(wordList.get(j),curr))
                          {
                              q.add(wordList.get(j));
                              hm.get(curr).add(wordList.get(j));
                              hs.add(j);
                           }
                       }
                   }
                }
              for(int x : hs)
              {
                  vis[x] = true;
              }
               count++;
             }
        return 0;
    }
    public void DFS(List<List<String>> res,List<String> al,List<String> wordList,int minLength,String endWord,String beginWord,HashMap<String,List<String>> hm)
    {
        
        if(minLength==al.size()-1)
        {
             if(endWord.equals(beginWord))
             {
                res.add(new ArrayList<String>(al));
             }
        
            return;
        }
        
        List<String> s = hm.get(beginWord);
        for(String k : s)
        {
        
            al.add(k);
            DFS(res,al,wordList,minLength,endWord,k,hm);
            al.remove(al.size()-1);        
                    
                
        }

}
    
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList)
    {
        HashMap<String,List<String>> hm = new HashMap<String,List<String>>();
        int  minLength = BFS(beginWord,endWord,wordList,hm);
        System.out.print(hm);
        System.out.println(minLength);
        List<List<String>> res = new ArrayList<List<String>>();
        List<String> al = new ArrayList<String>();
        al.add(beginWord);
        DFS(res,al,wordList,minLength,endWord,beginWord,hm);
        return res;
        
    }
  
}