class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
       Arrays.sort(intervals,(t1,t2) -> t1[0]-t2[0]);
        int a = intervals[0][0];
       int b = intervals[0][1];
        int count = 1;
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<=a && b<=intervals[i][1])
            {
                a = intervals[i][0];
                b = intervals[i][1];
                
            }
            else if(intervals[i][0]>=a && b>=intervals[i][1])
            {
                continue;
            }
            else 
            {
                a = intervals[i][0];
                b = intervals[i][1];
                count++;
            }
        }
        return count;
        
    }
}