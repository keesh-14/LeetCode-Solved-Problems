class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        int c = 0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(c<k)
                {
                    q.add(matrix[i][j]);
                    c++;
                }
                else 
                {
                    if(matrix[i][j]<q.peek())
                    {
                      q.poll();
                      q.add(matrix[i][j]); 
                    }
                }
            }
        }
        return q.peek();
    }
}