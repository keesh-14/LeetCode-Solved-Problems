class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hmap = new HashMap<Character,String>();
        String word[] = s.split(" ");
        if(pattern.length()!=word.length)
            return false;
        for(int i=0;i<pattern.length();i++)
        {
            if(hmap.containsKey(pattern.charAt(i)))
            {
                if(!hmap.get(pattern.charAt(i)).equals(word[i]))
                    return false;
            }
            else if(hmap.containsValue(word[i]))
            {
                    return false;
            }
            else 
                hmap.put(pattern.charAt(i),word[i]);
        }
        return true;
    }
}