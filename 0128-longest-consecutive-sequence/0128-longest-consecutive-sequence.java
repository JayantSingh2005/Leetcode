class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0,streak = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i < nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int i : set)
        {
            if(!(set.contains(i - 1)))
            {
                int curr = i;
                count = 1;
                while(set.contains(curr + 1))
                {
                    count++;
                    curr++;
                }
                streak = Math.max(streak,count);
            }
        }
        return streak;
    }
}