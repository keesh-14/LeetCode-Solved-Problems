class Solution {
    public int hist(int[] arr)
    {
        Stack<Integer> st1 = new Stack<Integer>();
        st1.add(arr.length-1);
       
        Stack<Integer> st2 = new Stack<Integer>();
         st2.add(0);
        
        int lb[] = new int[arr.length];
        int rb[] = new int[arr.length];
        lb[0] = -1;
        rb[arr.length-1] = arr.length;
        for(int i=arr.length-2;i>=0;i--)
        {
            while(!st1.isEmpty() && arr[st1.peek()]>=arr[i])
            {
                st1.pop();
            }
            if(st1.isEmpty())
            {
                rb[i] = arr.length;
            }
            else 
            {
                rb[i] = st1.peek();
            }
            st1.add(i);
        }
        for(int i=1;i<arr.length;i++)
        {
            while(!st2.isEmpty() && arr[st2.peek()]>=arr[i])
            {
                st2.pop();
            }
            if(st2.isEmpty())
            {
                lb[i] = -1;
            }
            else 
            {
                lb[i] = st2.peek();
            }
            st2.add(i);
        }
        int max = 0 ;
        for(int i=0;i<arr.length;i++)
        {
            int width = rb[i] - lb[i] - 1;
            max = Math.max(width*arr[i],max);
        }
        return max;
                
    }
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0)
            return 0;
        int s[][] = new int[matrix.length+1][matrix[0].length];
        for(int i=1;i<matrix.length+1;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i-1][j]=='0')
                    continue;
                s[i][j] = 1 + s[i-1][j];
            }
        }
        int max = 0;
        for(int i=1;i<s.length;i++)
        {
            max =  Math.max(hist(s[i]),max);
        }
        return max;
    }
}