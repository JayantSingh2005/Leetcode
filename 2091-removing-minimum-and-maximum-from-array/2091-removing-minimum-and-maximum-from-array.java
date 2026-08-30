class Solution {
    public int minimumDeletions(int[] nums) {
        int max = nums[0],min = nums[0];
        int n = nums.length;
        int maxIdx = 0,minIdx = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            maxIdx = i;}
            if(nums[i] < min){
                min = nums[i];
            minIdx = i;}
        }
        int c1 = Math.max(maxIdx, minIdx) + 1;
        int c2 = n - Math.min(minIdx, maxIdx);
        int c3 = Math.min(minIdx, maxIdx) + 1 + n - Math.max(minIdx, maxIdx);
        return Math.min(c1,Math.min(c2,c3)); 
    }
}