// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long a[], int n) {

        
        if(n==1)   return 1;
        if(n==2)   
        {
            if(a[0]==0)
            {
                return 2;
            }
            else if(a[1]==0)
            {
                return 1;
            }
            else return -1;
        }
        
        {
            int total=0;
            int leftsum=0;
            for(int i=0;i<n;i++)
            {
                total+=a[i];
            }
            for(int i=0;i<n;i++)
            {
                total-=a[i];
                
                if(total == leftsum) return i+1;
                leftsum+=a[i];
            }
            return -1;
        }
        
    }
}