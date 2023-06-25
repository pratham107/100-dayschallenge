import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int maximumChocolates(ArrayList<Integer> arr,int k){
         int ans=0;

        int[] ar=new int[arr.size()];
        for(int i=0;i<arr.size();i++)
        {
           ar[i]=arr.get(i);
        } 
        int n=ar.length; 
         while(k>0)
         {
             Arrays.sort(ar);
             ans += ar[n-1];
             ar[n-1]=ar[n-1]/2;
             k--;
         }

     return ans;
    }
}
