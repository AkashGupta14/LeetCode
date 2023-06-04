//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;


class GFG
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        int n;
        while(t-- > 0){
            n = sc.nextInt();
    
            Solution obj = new Solution();
            for(int i = 1; i <= n; i++)
            {
                int x =sc.nextInt();
                obj.insertHeap(x);
                System.out.println((int)Math.floor(obj.getMedian()));
            }
        }
        
        
    }
}


// } Driver Code Ends


class Solution
{
    //Function to insert heap.
    PriorityQueue<Integer> min , max;
    boolean even;
    public  Solution()
    {
        min =  new PriorityQueue<>();
        max =  new PriorityQueue<>(Collections.reverseOrder());
        even = true;
    }
    public  void insertHeap(int x)
    {
        // add your code here
        if(even)
        {
            min.offer(x);
            max.offer(min.poll());
        }
        else
        {
            max.offer(x);
            min.offer(max.poll());
        }
        even = !even;
        
    }
    
    //Function to balance heaps.
    
    
    //Function to return Median.
    public  double getMedian()
    {
        // add your code here
        if(even)
        {
            return (min.peek()+max.peek())/2.0;   
        }
        else
        {
            return (double) max.peek();
        }
    }
    
}