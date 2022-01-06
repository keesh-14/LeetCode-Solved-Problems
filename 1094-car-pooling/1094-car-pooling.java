class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int nums[] = new int[1001];
        for(int i=0;i<trips.length;i++)
        {
            nums[trips[i][1]] += trips[i][0];
            nums[trips[i][2]] -= trips[i][0];
       
        }
        int count = 0;
        int res = 0;
        for(int i=0;i<nums.length;i++)
        {
            count += nums[i];
            if(count>capacity)
                return false;
        }
        return true;
    }
}