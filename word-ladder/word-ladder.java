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
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q = new LinkedList<String>();
        boolean vis[] = new boolean[wordList.size()];
        q.add(beginWord);
        int count = 1;
        while(!q.isEmpty())
        {
            int c = q.size();
            for(int j =0;j<c;j++)
            {
                String curr = q.poll();
                if(endWord.equals(curr))
                    return count;
                for(int i=0;i<wordList.size();i++)
                {
                    if(vis[i]!=true)
                    {
                        if(check(curr,wordList.get(i)))
                        {
                            q.add(wordList.get(i));
                            vis[i] = true;
                        }
                    }
                }
            }
            count++;
            
        }
        return 0;
  }
}