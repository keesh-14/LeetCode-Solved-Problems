class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        for(int i : heaters)
        {
            ts.add(i);
        }
        int res =0;
        for(int t : houses)
        {
            Integer higher = ts.ceiling(t);
            Integer lower = ts.floor(t);
            if(lower==null)
                res = Math.max(res,higher-t);
            else if(higher==null)
                res = Math.max(res,t-lower);
            else 
                res = Math.max(res,Math.min(t-lower,higher-t));
        }
        return res;
        
    }
}