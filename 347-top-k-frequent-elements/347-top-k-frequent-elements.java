class Solution {
    class Pair{
        int key,value;
        Pair(int key,int value)
        {
            this.key = key;
            this.value = value;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
                hm.put(nums[i],hm.get(nums[i])+1);
            else 
                hm.put(nums[i],1);
        }
        PriorityQueue<Pair> q = new PriorityQueue<Pair>((p1,p2) -> (p1.value-p2.value));
        
        for(Map.Entry<Integer,Integer> en: hm.entrySet())
        {
            if(q.size()>=k)
            {
                if(q.peek().value<en.getValue())
                {
                    q.poll();
                    q.add(new Pair(en.getKey(),en.getValue()));
                }
            }
            else if(q.size()<k)
            {
                q.add(new Pair(en.getKey(),en.getValue()));
            }
          }
        int top[] = new int[k];
        int t = k -1;
        while(!q.isEmpty())
        {
            top[t] = q.poll().key;
            t--;
        }
        return top;
    }
}