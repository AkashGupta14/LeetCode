//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class OptimalStrategy
{
    public static void main (String[] args) {
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking number of elements
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            //inserting the elements
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
                
           //calling the countMaximum() method of class solve
           System.out.println(new solve().countMaximum(arr, n)); 
        }
    }
    
    
}
// } Driver Code Ends



class solve
{
    //Function to find the maximum possible amount of money we can win.
    static long countMaximum(int arr[], int n)
    {
        // Your code here
        return (long)optimal2(arr,0,n-1);
    }
    
    
    
    // recursive
    static int  optimal1(int a[] , int i , int j)
    {
        if(i+1==j) return Math.max(a[i],a[j]);
        int left = a[i] + Math.min(optimal1(a,i+2,j), optimal1(a,i+1,j-1));
        int right = a[j] + Math.min(optimal1(a,i+1,j-1), optimal1(a,i,j-2));
        return Math.max(left, right);
    }
    
    
    
    // top-down approach
    static int  optimal2(int a[] , int i , int j)
    {
        int  n = a.length;
        int dp[][] = new int[n][n];
        for(int x[]:dp)
        {
            Arrays.fill(x,-1);
        }
        optimaldp(a,i,j,dp);
        return dp[0][n-1];
        // diagonal filling;
    }
    static int  optimaldp(int a[] , int i , int j, int dp[][])
    {
        if(i+1==j) return dp[i][j]=Math.max(a[i],a[j]);
        if(dp[i][j]!=-1) return dp[i][j];
        int left = a[i] + Math.min(optimaldp(a,i+2,j,dp), optimaldp(a,i+1,j-1,dp));
        int right = a[j] + Math.min(optimaldp(a,i+1,j-1,dp), optimaldp(a,i,j-2,dp));
        return dp[i][j]=Math.max(left, right);
    }
}
