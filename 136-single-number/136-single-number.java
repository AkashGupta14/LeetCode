class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n =nums.length;
        for(int i=0;i<n;i=i+2)
        {
            if((i+1)<n)
            {
                if(nums[i]!=nums[i+1])
                {
                    return nums[i];
                }
            }
            else
            {
                return nums[i];
            }
        }
        return 0;
    }
}