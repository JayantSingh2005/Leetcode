class Solution {
    private int possible(int[] nums, long mid){
        int count = 1; long sum = 0;
        for(int i : nums)
        {
            if(i + sum > mid)
            {
                count++;
                sum = i;
            }
            else
            sum += i;
        }
        return count;
    }
    public int splitArray(int[] nums, int k) {
    long low = nums[0], high = 0,ans = 0;
    for(int i = 0;i < nums.length;i++)
    {
        low = Math.max(low, nums[i]);
        high += nums[i];
    }
    while(low <= high)
    {
        long mid = (low + high) / 2;
        if(possible(nums, mid) > k){
            low = mid + 1;
        }
        else
        {
            ans = mid;
            high = mid - 1;
        }
    }
    return (int) ans;
    }
}