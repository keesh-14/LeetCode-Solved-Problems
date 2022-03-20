class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int A[] = new int[7];
       int B[] = new int[7];
       int count[] = new int[7];
       for(int i=0;i<bottoms.length;i++)
       {
           if(tops[i]==bottoms[i])
           {
               count[tops[i]]++;
           }
           else 
           {
               count[tops[i]]++;
               count[bottoms[i]]++;
               A[tops[i]]++;
               B[bottoms[i]]++;
           }
           
       }
       for(int i=1;i<=6;i++)
       {
           if(count[i]==tops.length)
           return Math.min(A[i],B[i]);
       }
       return -1; 
    }
}