class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> al = new  ArrayList<Boolean>();
        int max=candies[0];
        for(int i=1;i<candies.length;i++)
        {
            max = Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++)
        {
           if(candies[i]+extraCandies >= max)
               al.add(true);
            else 
                al.add(false);
        }
        return al;
    }
}