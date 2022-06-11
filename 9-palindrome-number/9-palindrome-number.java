class Solution {
    public boolean isPalindrome(int x) {
        int y=0;
        int z=x;
        
        while(x!=0)
        {
            y=y*10;
            y=y+x%10;
            x=x/10;
        }
        if(z<0)
        {
            return false;
        }
        else if(z==y)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}