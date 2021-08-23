class Solution {
    public String[] findWords(String[] words) {
        String s1 ="qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        int ans[] = new int[26];
        for(int i=0;i<s1.length();i++)
        {
            ans[s1.charAt(i)-'a']=0;
        }
        for(int i=0;i<s2.length();i++)
        {
            ans[s2.charAt(i)-'a']=1;
        }
        for(int i=0;i<s3.length();i++)
        {
            ans[s3.charAt(i)-'a']=2;
        }
        List<String> al = new ArrayList<String>(); 
        for(int i=0;i<words.length;i++)
        {
            String temp = words[i].toLowerCase();
            int k = ans[temp.charAt(0)-'a'];
            int j=0;
            for(j=1;j<words[i].length();j++)
            {
                if(k!=ans[temp.charAt(j)-'a'])
                    break;
            }
            if(j==words[i].length())
                al.add(words[i]);
        }
        String res[] = new String[al.size()];
        for(int i=0;i<al.size();i++)
        {
            res[i] = al.get(i);
        }
        return res;
    }
}