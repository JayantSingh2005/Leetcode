class Solution {
    public int rob(int[] nums) {
       if(nums.length == 1)
       return nums[0];
       if(nums.length == 2)
       return Math.max(nums[0], nums[1]);  
       /*int[] track = new int[nums.length];  // to keep a track of max profit
       track[0] = nums[0];
       track[1] = Math.max(nums[0], nums[1]);
       for(int i = 2; i < nums.length; i++)
       {
        int take = nums[i] + track[i-2];
        int skip = track[i-1];
        track[i] = Math.max(take,skip);
       } 
       return track[nums.length-1];*/
       int prev = 0, max = 0;
       for(int curr : nums)
       {
        int temp = Math.max(max, prev + curr);
        prev = max;
        max = temp;
       }
       return max;
    }
}