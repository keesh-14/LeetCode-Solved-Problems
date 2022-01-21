class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int start = 0;
        int tank = 0;
        int shortage = 0;
       for(int i=0;i<gas.length;i++)
       {
           tank = tank + gas[i] - cost[i];
           if(tank<0)
           {
               shortage += tank;
               start = i+1;
               tank = 0;
           }
       }
      return (shortage+tank)>=0?start:-1;
        
    }
}