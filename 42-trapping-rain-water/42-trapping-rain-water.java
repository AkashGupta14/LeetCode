class Solution {
    public int trap(int[] a) {
        int ans = 0;
        int left = 0;
        int leftMax=0,rightMax=0;
        int right = a.length - 1;
        while(left<right)
        {
            if(a[left]<=a[right])
            {
                if(a[left]>leftMax) leftMax = a[left];
                else ans+=leftMax-a[left];
                left++;
            }
            else
            {
                if(a[right]>rightMax) rightMax = a[right];
                else ans+=rightMax-a[right];
                right--;
            }
            
            
        }
        return ans;
    }
}