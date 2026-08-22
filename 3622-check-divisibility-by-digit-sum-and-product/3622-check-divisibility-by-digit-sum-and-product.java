class Solution {
    public boolean checkDivisibility(int n) {
       int sum = 0, prod = 1, m = n;
       while(m != 0)
       {
        int last = m % 10;
        sum += last;
        prod *= last;
        m = m / 10;
       }
       int total = sum + prod;
       if(n % total == 0)
       return true;
       
       return false;

    }
}