class Solution {
    public int clumsy(int n) {
       int total = 0;
       int result = n;
        char op = '*';
        while(n>1)
        {
            switch (op)
            {
                case '*':
                    result *= --n;
                     op = '/';
                    break;
                case '/':
                    result /= --n;
                    op = '+';
                    break;
                case '+':
                    result += --n;
                    op = '-';
                    break;
                case '-':
                    total = total + result;
                    result =   --n*(-1);
                    op = '*';
                    break;
            }
        }
        return total + result;
    }
}