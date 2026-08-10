class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0,high = 0, ans = -1;
        for(int i : weights)
        {
            low = Math.max(low, i);
            high += i;
        }
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(daysR(weights, mid) <= days)
            {
                ans = mid;
                high = mid - 1;
            }
            else 
            low = mid + 1;
        }
        return ans;
    }
    private int daysR(int[] nums, int capacity)
    {
        int load = 0, day = 1;
        for(int i : nums){
        if(load + i > capacity)
        {
            day += 1;
            load = i;
        }
        else 
        load += i;
        }
        return day;
    }
}