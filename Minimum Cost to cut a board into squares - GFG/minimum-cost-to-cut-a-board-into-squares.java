//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        Scanner sc=new Scanner(System.in);
        t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            String P[]=br.readLine().trim().split(" ");
            int m=Integer.parseInt(P[0])-1;
            int n=Integer.parseInt(P[1])-1;
            String A[]=br.readLine().trim().split(" ");
            String B[]=br.readLine().trim().split(" ");
            ArrayList<Integer> l=new ArrayList<>();
            for(String s : A){
                if(s.equals(""))
                continue;
                l.add(Integer.parseInt(s));
            }
            for(String s : B){
                if(s.equals(""))
                continue;
                l.add(Integer.parseInt(s));
            }
            int [] X =new int[m];
            int [] Y=new int[n];
            int ind=0;
            for(int i=0;i<m;i++){
                X[i]=l.get(ind++);
            }
            for(int i=0;i<n;i++){
                Y[i]=l.get(ind++);
            }
            
            Solution obj = new Solution();
            int res = obj.minimumCostOfBreaking(X, Y,m,n);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int minimumCostOfBreaking(int[] x, int[] y,int m,int n) {
        // code here
        // x is vertical y is horizontal , x1 counts board horizontaly , y1 counts 
        // board vetically
        int x1 = 1 , y1= 1 , a = m-1 ,b= n-1 ,cost = 0;
        Arrays.sort(x);
        Arrays.sort(y);
        while(a>=0 && b>=0)
        {
            if(x[a]>=y[b]  )
            {
                cost+=x[a]*y1;
                x1++;
                a--;
            }
            else
            {
                cost+=y[b]*x1;
                y1++;
                b--;
            }
        }
        if(a<0  )
        {   while(b>=0){
            cost+=y[b]*x1;
            y1++;
            b--;}
        }
        if(b<0)
        {
            while(a>=0)
            {
                cost+=x[a]*y1;
                x1++;
                a--;
            }
        }
        return cost;
    }
}
        
