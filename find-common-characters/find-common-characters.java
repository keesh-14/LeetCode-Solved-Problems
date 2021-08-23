class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<String>();
        int res[] = new int[26];
        for(int i=0;i<words[0].length();i++)
        {
              res[words[0].charAt(i)-'a']++;
            
        }
        for(int i=1;i<words.length;i++)
        {
            int s[] = new int[26];
            for(int j=0;j<words[i].length();j++)
            {
                s[words[i].charAt(j)-'a']++;
            }
            for(int j=0;j<26;j++)
            {
                res[j] = Math.min(s[j],res[j]);
            }
            
        }
       for(int i=0;i<26;i++)
       {
            while(res[i]-->0)
                ans.add(Character.toString(i+'a'));
        }
        return ans;
    }
}