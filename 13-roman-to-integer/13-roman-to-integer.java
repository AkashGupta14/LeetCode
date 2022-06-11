class Solution {
    public int romanToInt(String s) {
        int x = 0;
        for(int i=0;i<s.length();i++)
        {
            
            char a = s.charAt(i);
            switch(a){
                case 'I':
                    if((i+1!=s.length()) && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X'))
                    {
                        x-=1;
                    }
                    else{
                        x+=1;
                    }
                    break;
                case 'V':x+=5;
                    break;
                case 'X':
                    if((i+1!=s.length()) && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C'))
                    {
                        x-=10;
                    }
                    else{
                        x+=10;
                    }
                    break;
                case 'L':x+=50;
                    break;
                case 'C':
                    if((i+1!=s.length()) && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M'))
                    {
                        x-=100;
                    }
                    else{
                        x+=100;
                    }
                    break;
                case 'D':x+=500;
                    break;
                case 'M':x+=1000;
                    break;
                               
                    
            }
            
        }
        return x;
    }
}