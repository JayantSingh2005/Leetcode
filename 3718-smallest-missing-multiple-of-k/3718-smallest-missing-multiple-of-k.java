class Solution {
    public int missingMultiple(int[] nums, int k) {
       HashSet<Integer> set = new HashSet<>();
       int ans = 0;
       for(int i : nums)
       set.add(i);
       for(int i = k;i >= k;i += k){
            if(!set.contains(i))
            {
                ans = i;
                break;
            }
       } 
       return ans;
    }
}