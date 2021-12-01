class Solution {
    public int back(String words[],int freq[],int score[],int idx)
    {
        if(idx == words.length)
            return 0 ;
        int no = 0 + back(words,freq,score,idx+1);
        boolean flag =  true;
        int currScore = 0;
        String word = words[idx];
        for(int i=0;i<word.length();i++)
        {
            if(freq[word.charAt(i) - 'a']==0)
            {
                flag = false;
            }
            freq[word.charAt(i) - 'a']--;
            currScore = currScore + score[word.charAt(i) - 'a'];
        }
        int yes = 0;
        if(flag)
        {
           yes = currScore + back(words,freq,score,idx+1); 
        }
        for(int i=0;i<word.length();i++)
        {
            freq[word.charAt(i) - 'a']++;
        }
            
        return Math.max(yes,no);    
    }
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int freq[] = new int[26];
        for(int  i=0;i<letters.length;i++)
        {
            freq[letters[i] - 'a']++;
        }
        return back(words,freq,score,0);
    }
}