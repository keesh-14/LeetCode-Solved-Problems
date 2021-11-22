class Solution {
    public int minCost(String s, int[] cost) {
        char[] str = s.toCharArray();
        int minCost = 0;
        for(int i = 1; i < str.length; i++){
            if(str[i] == str[i - 1]){
				// accrue the cost of deletion for the lower duplicate
                minCost += Math.min(cost[i], cost[i - 1]);
				// keep the cost of the higher duplicate for next iteration
                cost[i] = Math.max(cost[i], cost[i - 1]);
            }
        }
        return minCost;
    }
}