class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->a[0]-b[0]);
        if(points.length==0)
            return 0;
        int low = points[0][0];
        int high = points[0][1];
        int count =1;
        for(int i=1;i<points.length;i++)
        {
            if(points[i][0]>=low && points[i][0]<=high)
            {
                low = Math.max(low,points[i][0]);
                high = Math.min(high,points[i][1]);
            }
            else 
            {
                count++;
                low = points[i][0];
                high = points[i][1];
            }
            
        }
        return count;
    }
}