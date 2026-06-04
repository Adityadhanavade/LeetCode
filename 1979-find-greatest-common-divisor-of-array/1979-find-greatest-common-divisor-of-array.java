class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for(int i=0; i<nums.length; i++)
        {
            if(min>nums[i])
            {
                min = nums[i];
            }
            if(max<nums[i])
            {
                max = nums[i];
            }
        }
        int dividemax = 1;
        for(int i=1; i<=min; i++)
        {
            if(min % i == 0 && max % i == 0 )
            {
                dividemax = i;
            }
        }
        return dividemax;
    }
}