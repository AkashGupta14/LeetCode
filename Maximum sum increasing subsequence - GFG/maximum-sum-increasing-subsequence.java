//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int maxSumIS(int a[], int n)  
	{   
        int dp[] = new int[n];
        dp[0] = a[0];
        int max = a[0];
        for(int i = 1;i<n;i++)
        {
            dp[i]=a[i];
            for(int j =0;j<i;j++)
            {
                if(a[j]<a[i])
                {
                    dp[i] = Math.max(dp[i],dp[j]+a[i]);
                }
            }
            max = Math.max(max,dp[i]);
        }
        return max;
	}  
}