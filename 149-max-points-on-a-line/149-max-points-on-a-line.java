class Solution {
    public int maxPoints(int[][] points) {
        HashMap<Double,Integer> hm = new HashMap<Double,Integer>();
        int ans = 0;
        for(int i=0;i<points.length;i++)
        {
            int xi = points[i][0];
            int yi = points[i][1];
            for(int j=i+1;j<points.length;j++)
            {
                 int xj = points[j][0];
                 int yj = points[j][1];
                 double slope = 0.0;
                 if(xi==xj)
                     slope = Double.MAX_VALUE;
                 else if(yi==yj)
                     slope = 0.0;
                 else 
                    slope = (double)(yj - yi)/(xj-xi);
                if(hm.containsKey(slope))
                    hm.put(slope,hm.get(slope)+1);
                else 
                    hm.put(slope,1);
                
                ans = Math.max(hm.get(slope),ans);
                
            }
            hm.clear();
        }
        return ans+1;
    }
}