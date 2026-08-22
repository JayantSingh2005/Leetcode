class Solution {
    public boolean checkDivisibility(int n) {
       int sum = 0, prod = 1, m = n;
       while(m != 0)
       {
        sum += m % 10;
        prod *= m % 10;
        m = m / 10;
       }
       if(n % (sum + prod) == 0)
       return true;
       else 
       return false;

    }
}