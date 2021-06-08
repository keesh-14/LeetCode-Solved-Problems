class Solution {
    public double myPow(double x, int n) {
        double pow=0;
        if(n==0)
            return 1;
        double temp = myPow(x,n/2);
        if(n%2==0)
        {
            pow = temp*temp;
        }
        else if(n<0)
            pow = temp*temp/x;
        else 
            pow = temp*temp*x;
        
        return pow;
    }
}