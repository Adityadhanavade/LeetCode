class Solution {
    public int maxSubArray(int[] nums) {
     
        int sum = 0; 
        int maxsum = nums[0];
       
        for(int i=0; i<nums.length; i++)
        {
            sum = sum + nums[i];
            if(maxsum < sum)
            {
                maxsum = sum;
            }
            if(sum < 0)
            {
                sum = 0;
            }
        } 
        
        return maxsum;
    }
}

/*
//own logic
int sum = 0; 
        int maxsum = Integer.MIN_VALUE;
        int nvemax = Integer.MIN_VALUE;
        boolean flag = true;
        for(int i=0; i<nums.length; i++)
        {
            if(flag)
            {
                if(nums[i]<0)
                {
                    if(nvemax < nums[i])
                    {
                        nvemax = nums[i];
                    }
                }
                else
                {
                    flag = false;
                }
            }

            sum = sum + nums[i];
            if(maxsum < sum)
            {
                maxsum = sum;
            }
            if(sum < 0)
            {
                sum = 0;
            }
        } 

        if(flag)
            return nvemax;
        else
            return maxsum;

            */