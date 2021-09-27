class Solution {
    
    public int nthUglyNumber(int n) {
       int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        int arr[] = new int[n];
        arr[0]  =  1;
        for(int i=1;i<n;i++)
        {
            int two = arr[index2] * 2;
            int three = arr[index3] * 3;
            int five = arr[index5] * 5;
            arr[i] = Math.min(Math.min(two,three),five);
            if(arr[i]==two)index2++;
            if(arr[i]==three)index3++;
            if(arr[i]==five)index5++; 
        }
        return arr[n-1];
    }
}