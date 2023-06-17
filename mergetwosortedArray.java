GfG Merge two sorted Array

code: 
class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
      long[] temp=new long[n+m];
       int tl=0;
       for(int i=0;i<n;i++){
           temp[tl]=arr1[i];
           tl++;
       }
       for(int i=0;i<m;i++){
           temp[tl]=arr2[i];
           tl++;
       }
       Arrays.sort(temp);
       int r=0;
       for(int i=0 ;i<n;i++)
       {
           arr1[i]=temp[r];
           r++;
       }
        for(int i=0 ;i<m;i++)
       {
           arr2[i]=temp[r];
           r++;
       }
       
    }
}


code studio question 
without 0
    
code: 
public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<m;i++)
            {
                list.add(arr1[i]);
            }  
            for(int j=0;j<n;j++)
            {
                list.add(arr2[j]);
            } 
             for(int k=0;k<list.size();k++)
            {
                if(list.get(k)!=0)
                {
                    arr1[k]=list.get(k);
                }
            } 
            Arrays.sort(arr1);         
 

       return arr1;
    }
}
