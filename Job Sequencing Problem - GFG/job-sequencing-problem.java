//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code her
        Arrays.sort(arr , (i,j)->j.profit-i.profit);
        int d = 0 ; 
        for(int i = 0;i<n;i++)
        {
            d = Math.max(d , arr[i].deadline);
        }
        int a[] = new int[d+1];
        Arrays.fill(a,-1);
        int c = 0 , p = 0;
        for(int i = 0;i<n;i++)
        {
            for(int j = arr[i].deadline;j>0;j--)
            {
                if(a[j]==-1) // free slot found
                {
                    a[j] = arr[i].id;
                    c++;
                    p  +=arr[i].profit;
                    break;
                }
            }
        }
        int ans[] = new int[2];
        ans[0] = c;
        ans[1] = p;
        return ans;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/