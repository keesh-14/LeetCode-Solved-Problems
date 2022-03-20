class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int len  = A.length;
        int[] countSum = new int[7], countA = new int[7], countB = new int[7];
		
        for(int i = 0 ; i < len; i++) {
            if(A[i] == B[i]) 
                countSum[A[i]]++;
            else {
                countSum[A[i]]++;
                countSum[B[i]]++;
                countA[A[i]]++;
                countB[B[i]]++;
            }
        }
        
        for(int i = 1; i <= 6; i++) {
            if(countSum[i] == len) 
                return Math.min(countA[i], countB[i]);
        }
        
        return -1; 
    }
}