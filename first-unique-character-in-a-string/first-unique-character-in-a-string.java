class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> tmap = new LinkedHashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(tmap.containsKey(s.charAt(i)))
            tmap.put(s.charAt(i),-1);
            else 
            tmap.put(s.charAt(i),i);    
        }
        for(Map.Entry<Character,Integer> entry : tmap.entrySet())
        {
            if(entry.getValue()!=-1)
                return entry.getValue();
                
                
        }
        return -1;
    }
}