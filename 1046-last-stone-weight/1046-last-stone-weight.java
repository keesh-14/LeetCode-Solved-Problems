class Solution {
    
    public int lastStoneWeight(int[] stones) {
        
        if (stones.length == 1) {
            return stones[0];
        }
        
        List<Integer> stoneList = new ArrayList<Integer>();
        for (int stone : stones) {
            stoneList.add(stone);
        }
        
        while (stoneList.size() > 1) {
            
            int[] indices = maxIndices(stoneList);
            int max1 = indices[0];
            int max2 = indices[1];
            int stone1 = stoneList.get(max1);
            int stone2 = stoneList.get(max2);
            
            if (stone1 == stone2) {
                stoneList.remove(max1);
                if (max2 > max1) {
                    max2--;
                }
                stoneList.remove(max2);
                if (stoneList.size() == 0) {
                    return 0;
                }
            }
            
            else {
                stone1 -= stone2;
                stoneList.remove(max2);
                if (max1 > max2) {
                    max1--;
                }
                stoneList.set(max1, stone1);
            }
        }
        
        return stoneList.get(0);
    }
    
    public int[] maxIndices(List<Integer> stones) {
        
        int max1 = 0;
        int max2 = 1;
        
        for (int i = 0; i < stones.size(); i++) {
            if (stones.get(i) > stones.get(max1)) {
                max2 = max1;
                max1 = i;
            }
            else if (stones.get(i) > stones.get(max2) && i != max1) {
                max2 = i;
            }
        }
        
        return new int[]{max1, max2};
    }
}