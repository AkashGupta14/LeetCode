//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int palindromicPartition(String str)
    {
        char c[] = str.toCharArray();
        int n  = c.length;
        int dp[][] = new int[n][n];
        for(int len = 1 ; len<n ; len++)
        {
            for(int row = 0 , col = len ; row<n-len;row++,col++)
            {
                if(ispalindrom(c,row,col))
                {
                    dp[row][col] = 0;
                }
                else
                {
                    dp[row][col] = Integer.MAX_VALUE;
                    for(int k = row;k<col;k++)
                    {
                        dp[row][col] = Math.min(dp[row][col],dp[row][k]+dp[k+1][col]+1);
                    }
                }
            }
        }
        return dp[0][n-1];
    }
    static boolean ispalindrom(char c[] , int s , int e)
    {
        while(s<e)
        {
            if(c[s]!=c[e]) return false;
            s++;
            e--;
        }
        return true;
    }
}