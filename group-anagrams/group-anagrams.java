class Solution {
    
   
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
            if(strs.length==0)
                return res;
        HashMap<String,ArrayList<String>> hm = new HashMap<>();
         for(int i=0;i<strs.length;i++)
        {
             char arr[] = strs[i].toCharArray();
             Arrays.sort(arr);
             String temp = String.valueOf(arr);
             if(hm.containsKey(temp))
              {
                 hm.get(temp).add(strs[i]);
        
               }
            else 
                hm.put(temp,new ArrayList<String>(Arrays.asList(strs[i])));
        }
        for(Map.Entry<String,ArrayList<String>> entry : hm.entrySet())
        {
            res.add(entry.getValue());
        }
        return res;
    }
}