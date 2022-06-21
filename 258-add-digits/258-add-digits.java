class Solution {
    public int addDigits(int x) {
        int sum=0;
        if(x<10) return x;
        else
        {
            while((x)!=0)
            {
                
                sum=sum + x%10;
                x=x/10;
            }
        }
        return addDigits(sum);
    }
}