//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class GfG {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            System.out.println(String.format("%.2f", new Solution().fractionalKnapsack(w, arr, n)));
        }
    }
}
// } Driver Code Ends


/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int w, Item a[], int n) 
    {
        // Your code here
        Arrays.sort(a, new Comparator<Item>()
        {
            public int compare(Item i1 , Item i2)
            {
                return i1.weight*i2.value - i2.weight*i1.value;
            }
        });
        double ans = 0;
        for(int i = 0;i<n;i++)
        {
            if(w >= a[i].weight)
            {
                ans += (double)a[i].value;
                w = w - a[i].weight;
            }else{
                ans += (double)((a[i].value*w)/(double)a[i].weight);
                break;
            }
        }
        return ans;
    }
}