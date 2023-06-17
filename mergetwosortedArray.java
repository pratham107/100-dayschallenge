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
