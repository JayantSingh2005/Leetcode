class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        arr1[0] = nums[0];
        arr2[0] = nums[1];
        int c1 = 1,c2 = 1;
        for(int i = 2;i < nums.length; i++)
        {
            if(arr1[c1 - 1] > arr2[c2 - 1])
            {
                arr1[c1] = nums[i];
                c1++;
            }
            else
            {
                arr2[c2] = nums[i];
                c2++;
            }
        }
        for(int i = 0;i < c2;i++)
        {
            arr1[c1] = arr2[i];
            c1++;
        }
        return arr1;
    }
}