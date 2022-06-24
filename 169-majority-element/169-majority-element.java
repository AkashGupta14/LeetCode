class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int c=1;
        for(int i = 0 ;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    c++;
                }
            }
            if(c>(n/2))
            {
                return nums[i];
            }
            c=1;
        }
        return c;
    }
}