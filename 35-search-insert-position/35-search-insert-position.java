class Solution {
    public int searchInsert(int[] nums, int target) {
        int x= nums.length-1;
        int i=0;
        int mid=0;
        while(i<=x)
        {
            mid=(i+x)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                i=mid+1;
            }
            else
            {
                x=mid-1;                
            }
        }
        
        return x+1;
    }
}