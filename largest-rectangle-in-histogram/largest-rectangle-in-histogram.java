class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<Integer>();
        int res = 0;
        int n = heights.length;
        int area=0;
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() &&  heights[i]<=heights[st.peek()])
            {
                int t = st.pop();
                area =  heights[t]*(st.isEmpty()?i:(i-st.peek()-1));
            
                 res = Math.max(res,area);
            }
              st.add(i);
            
        
        }
        while(!st.isEmpty())
            {
                int t = st.pop();
                area =  heights[t]*(st.isEmpty()?n:(n-st.peek()-1));
            
                 res = Math.max(res,area);
            }
        return res;
    }
}