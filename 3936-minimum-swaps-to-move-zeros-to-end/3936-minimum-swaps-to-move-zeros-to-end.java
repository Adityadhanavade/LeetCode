class Solution {
    public int minimumSwaps(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int cnt = 0;

        while(start<end)
        {
            if(nums[start]==0 && nums[end] != 0)
            {
                nums[start] = nums[end];
                nums[end] = 0;
                start++;
                end--;
                cnt++;
            }
            else if(nums[start]!=0)
            {
                start++;
            }
            else if(nums[end]==0)
            {
                end--;
            }
        }
        return cnt;
    }
}