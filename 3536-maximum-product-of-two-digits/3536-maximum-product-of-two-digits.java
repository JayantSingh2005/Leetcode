class Solution {
    public int maxProduct(int n) {
        int first = n % 10;
        n /= 10;
        int second = n % 10;
        n /= 10;
        if(first < second)
        {
            int temp = second;
            second = first;
            first = temp;
        }
        while(n != 0)
        {
            int a = n % 10;
            if(a > first)
            {
                second = first;
                first = a;
            }
            else if(a <= first && a > second)
            second = a;
            n /= 10;
        }
        return first * second;
    }
}