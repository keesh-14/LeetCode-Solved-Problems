class Solution {
    public int lengthOfLongestSubstring(String s) {
    HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        int max = 0;
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
               {
                   count = 0;
                   i = hm.get(s.charAt(i)) + 1;
                   hm.clear();
               }
               hm.put(s.charAt(i),i);
               count++;
               
               max = Math.max(count,max);
        }
               return max;
        
    }
}