// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            StringBuilder out = new StringBuilder();
            ans = ob.jugglerSequence(N);
            for(int i = 0;i < ans.size();i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<Integer> jugglerSequence(int N){
        List<Integer> c = new ArrayList<Integer> ();
                c.add(N);
        for(int i=1;c.get(i-1)!=1;i++)
        {
            
            {
                
            if(c.get(i-1)%2==0)
            {
                c.add((int) Math.pow(c.get(i-1),0.5));}
            
            else
            {
                c.add((int) Math.pow(c.get(i-1),1.5));
            }
            }
            
        }
        
        return c;
    }
}