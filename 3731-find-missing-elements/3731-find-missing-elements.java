class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        int[] arr = new int[101];int min = 101,max = 0;
        for(int i = 0;i < nums.length;i++)
        {
            arr[nums[i]] = 1;
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        for(int i = min;i<= max; i++)
        {
            if(arr[i]!=1)
            list.add(i);
        }
        return list;
    }
}