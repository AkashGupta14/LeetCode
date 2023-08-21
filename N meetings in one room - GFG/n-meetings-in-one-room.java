//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

class Pair
    {
        int s , e;
        Pair(int  s , int e)
        {
            this.s = s;
            this.e = e;
        }
    }
class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        PriorityQueue<Pair> pq = new PriorityQueue<>((i,j)->
        {
            if(i.e>j.e)
            {
                return 1;
            }
            else if(i.e<j.e)
            {
                return -1;
            }
            else 
            {
                return i.s-j.s;
            }
        });
        
        for(int i = 0;i<n;i++)
        {
            pq.add(new Pair(start[i] , end[i]));
        }
        int ans = 1; 
        Pair f = pq.poll();
        int s = f.s, e = f.e;
        while(pq.size()>0)
        {
            Pair c = pq.poll();
            if(e<c.s)
            {
                ans++;
                s = c.s;
                e = c.e;
            }
        }
        return ans;
        
        
    }
}
