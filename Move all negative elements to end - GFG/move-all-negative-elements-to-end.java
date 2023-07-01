//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
            System.out.println();
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        // int s  = 0;
        // int e = n;
        // while(s<e)
        // {
        //     if(arr[s]<0)
        //     {
        //         e--;
        //         swap(arr,s,e);
        //     }
        //     else
        //     {
        //         s++;
        //     }
        // }
        int n1 [] = new int[n];
        int cn = 0;
        int p[] = new int[n];
        int pn = 0;
        for(int i :arr)
        {
            if(i<0)
            {
                n1[cn] = i;
                cn++;
            }
            else
            {
                p[pn] = i;
                pn++;
            }
        }
        for(int i = 0;i<n;i++)
        {
            if(i<pn)
            {
                arr[i] = p[i];
            }
            else
            {
                arr[i] = n1[i-pn];
            }
        }
        
    }
    void swap(int a[] , int i , int j)
    {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}