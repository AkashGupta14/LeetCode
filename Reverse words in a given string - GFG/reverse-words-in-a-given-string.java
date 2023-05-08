//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
        // code here 
        ArrayDeque<Character> q5 = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != '.') {
                q5.push(c);
                continue;
            }
            if (c == '.') {
                String ans = "";
                while (!q5.isEmpty()) {
                    char z = q5.pop();
                    sb.append(z);

                }
                char a = '.';
                sb.append(a);
            }
        }
        while (!q5.isEmpty()) {
            char z = q5.pop();
            sb.append(z);

        }
        String string = sb.toString();
        return string;
    }
}