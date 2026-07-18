class Solution {
    public int findGCD(int[] nums) {
        int min = 1001;
        int max = 0;
        for(int i : nums)
        {
            if(min > i)
            min = i;
            if(max < i)
            max = i;
        }
        return gcd(min,max);
    }
    private int gcd(int a, int b)
    {
        while(b != 0)
        {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}