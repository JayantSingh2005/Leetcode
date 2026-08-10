class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        if(nums.length > threshold)
        return -1;
        int ans = -1,low = 1, high = Arrays.stream(nums).max().getAsInt();
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(sum(nums,mid) <= threshold)
            {
                ans = mid;
                high = mid - 1;
            }
            else
            low = mid + 1;
        }
        return ans;
    }
    private int sum(int[] nums, int d){
        int total = 0;
        for(int i : nums){
            total += Math.ceil((double)i/d);
        }
        return total;
    }
}