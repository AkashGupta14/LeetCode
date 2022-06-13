class Solution {
    public int maxArea(int[] a) {
        int max=0;
        int l=0;
        int r=a.length-1;
        while(l<r)
        {
            int h=Math.min(a[l],a[r]);
            int d=l-r;
            d=Math.abs(d);
            int area = d*h;
            max = Math.max(area,max);
            if(a[l]<a[r]) l++;
            else r--;
        }
        return max;
            
        
    }
}