class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            hm.put(arr[i],hm.get(arr[i])+1);
            else 
            hm.put(arr[i],1);
        }
        HashSet<Integer> hs = new HashSet<Integer>();
        for(Map.Entry<Integer,Integer> entry: hm.entrySet())
        {
            hs.add(entry.getValue());
        }
        if(hs.size()==hm.size())
            return true;
        else 
            return false;
    }
}