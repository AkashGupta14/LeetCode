//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int getMinDiff(int[] arr, int n, int k) {
        if (arr == null || n<=0) return -1;
        Arrays.sort(arr);   // 4 7 8 12   k = 3 ==>  1,4 5 9  ==>  9 - 5 =4 ans
    
        int min = 0,max = 0,res = 0;
        res = arr[n-1] - arr[0];
        for (int i = 1;i<n;++i){
        if (arr[i]>=k){
            max = Math.max(arr[i-1]+k,arr[n-1]-k);
            min   =Math.min(arr[i]-k,arr[0]+k);
    
            res = Math.min(res,max-min);
        }else {
            continue;
        }
        }
        return res;
    }
}

