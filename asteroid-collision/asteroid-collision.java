class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<Integer>();
        HashMap<Integer,Integer> hm = new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<asteroids.length;i++)
        {
            hm.put(i,asteroids[i]);
        }
        for(int i=0;i<asteroids.length;i++)
        {
            if(asteroids[i]<0)
            {
                while(!st.isEmpty() && hm.containsKey(i))
                {
                      int idx = st.peek();
                      int curr = asteroids[idx];
                      if(Math.abs(curr)>Math.abs(asteroids[i]))
                      {
                          hm.remove(i);
                      }
                      else if(Math.abs(curr)==Math.abs(asteroids[i]))
                      {
                          hm.remove(i);
                          hm.remove(idx);
                          st.pop(); 

                      }
                      else 
                      {
                         hm.remove(idx);
                          st.pop();
                      }
                }
               
              }
              else 
              {
                 st.add(i);
              }
        }
        int k = 0;
        int ans[] = new int[hm.size()];
         for(Map.Entry<Integer,Integer> entry : hm.entrySet())
         {
             ans[k] = entry.getValue();
             k++;
         }
        return ans;
    }
}