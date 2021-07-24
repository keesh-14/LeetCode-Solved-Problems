class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> al  = new ArrayList<Integer>();
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
                hm.put(nums[i],hm.get(nums[i])+1);
            else 
                hm.put(nums[i],1);
        }
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        int j=0;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet())
        {
            if(j>=k)
            {
                if(q.peek()<entry.getValue())
                {
                q.poll();
                q.add(entry.getValue());
                }
            }
            else 
            {
                q.add(entry.getValue());
                j++;
            }
        }
        HashSet<Integer> hs = new HashSet<Integer>();
        while(!q.isEmpty())
        {
            int curr = q.poll();
            if(hm.containsValue(curr))
            {
                for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                  if (Objects.equals(entry.getValue(), curr)) {
                  hs.add(entry.getKey());
                  
              }
                    
              }
                
            }
            
        }
        int arr[] = new int[hs.size()];
        int i=0;
        for(int s : hs)
        {
            arr[i] = s;
            i++;
        }
        return arr;
    }
}