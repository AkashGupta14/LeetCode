class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> x1= new ArrayList<Integer>();
        ArrayList<Integer> x2= new ArrayList<Integer>();
        int j=0;
        
        for(int i =0;i<nums1.length;i++)
        {
            x1.add(nums1[i]);
        }
        for(int i =0;i<nums2.length;i++)
        {
            if(x1.contains(nums2[i]))
            {
                if(!(x2.contains(nums2[i])))
                {
                    x2.add(nums2[i]);
                    j++;
                }
            }
        }
        int []result=new int[j];
        for(int i=0;i<j;i++)
        {
            int m =x2.get(i);
            result[i]=m;
        }
        return result;
        
    }
}