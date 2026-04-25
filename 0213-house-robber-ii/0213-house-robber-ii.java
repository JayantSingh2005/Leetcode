class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)
        return nums[0];
        if(nums.length == 2)
        return Math.max(nums[0],nums[1]);
        int[] track1 = new int[nums.length-1];
        int[] track2 = new int[nums.length-1];
        track1[0] = nums[0];
        track1[1] = Math.max(nums[0],nums[1]);
        track2[0] = nums[1];
        track2[1] = Math.max(nums[1], nums[2]);
        for(int i = 2; i < nums.length - 1; i++)
        {
            int take = nums[i] + track1[i-2];
            int skip = track1[i-1];
            track1[i] = Math.max(take, skip);
        }
        for(int i = 3; i < nums.length; i++)
        {
            int take = nums[i] + track2[i-2-1];
            int skip = track2[i-1-1];
            track2[i-1] = Math.max(take, skip);
        }
        return Math.max(track1[nums.length - 2], track2[nums.length -2]);
    }
}