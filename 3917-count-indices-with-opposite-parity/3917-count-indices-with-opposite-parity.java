class Solution {
    public int[] countOppositeParity(int[] nums) {
        
        int evencnt = 0;
        int oddcnt = 0;
        int cnt = nums.length-1;
        int []res = new int[nums.length];
        for(int i=nums.length-1; i>=0; i--)
        {
            if(nums[i] % 2 == 0)
            {
               res[cnt--] = oddcnt;
               evencnt++;
            }
            else
            {
                res[cnt--] = evencnt;
                oddcnt++;
            }
          
        }
        return res;
    }
}