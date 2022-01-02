class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int count = 0;
        for(int i=0;i<time.length;i++)
        {
            if(hm.containsKey(60-(time[i]%60==0?60:time[i]%60)))
            {
                count += hm.get(60-(time[i]%60==0?60:time[i]%60));
            }
            if(hm.containsKey(time[i]%60))
            {
                hm.put(time[i]%60,hm.get(time[i]%60)+1);
            }
            else 
                hm.put(time[i]%60,1);
        }
        return count;
    }
}