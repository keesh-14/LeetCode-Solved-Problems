class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int req = 0;
        int start = 0;
        
        for(int i=0;i<gas.length;i++)
        {
            tank += gas[i] - cost[i];
            if(tank<0)
            {
                start = i+1;
                req += tank;
                tank = 0;
            }
            
            
        }
        return tank+req>=0?start:-1;
        
    }
}