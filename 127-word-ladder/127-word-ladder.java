class Solution {
    public boolean check(String a,String b)
    {
        int count = 0;
        if(a.length()!=b.length())
            return false;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=b.charAt(i))
            {
                count ++;
            }
        }
        if(count>1)
            return false;
        return true;
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q = new LinkedList<String>();
        q.add(beginWord);
        int count =1;
        boolean vis[] = new boolean[wordList.size()];
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                String curr = q.poll();
                if(curr.equals(endWord))
                    return count;
                
                for(int j=0;j<wordList.size();j++)
                {
                    if(vis[j]!=true)
                    {
                        if(check(curr,wordList.get(j)))
                        {
                            q.add(wordList.get(j));
                            vis[j] = true;
                        }
                    }
                }
                
            }
            count++;
        }
        return 0;
    }
}