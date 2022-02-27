class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for(int i=0;i<words.length;i++)
        {
            if(hm.containsKey(words[i]))
            hm.put(words[i],hm.get(words[i])+1);
            else 
            hm.put(words[i],1);    
        }
         List<Map.Entry<String, Integer>> list =
               new ArrayList<Map.Entry<String, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return o2.getValue() - o1.getValue()==0?o1.getKey().compareTo(o2.getKey()):o2.getValue() - o1.getValue();
            }
        });
        
       
        int count = 0;
        List<String> ans = new ArrayList<String>();
        for(Map.Entry<String,Integer> entry : list)
        {
            
             if(count==k)
                break;
            //System.out.println(entry.getKey()+" "+entry.getValue());
            ans.add(entry.getKey());
            count++;
           
        }
         
        return ans;
    }
}