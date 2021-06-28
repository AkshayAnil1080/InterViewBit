// Given [1,2,0] return 3,
// [3,4,-1,1] return 2,
// [-8, -7, -6] returns 1

// Find first missing +ve integer
Idea
a. partition array into -ve ele first and then +ve elements
b. copy all +ve ele in anothe arr
c. call the fun for finding missing and return the ans.
TC,SC: n,n

public class Solution {
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        int j=0;
        for( int i =0 ;i <n;i++)  //a.
        {
           if(arr[i]<=0)
           {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               j++;
           }
        }
        int arr2[] = new int[n-j];    //b.
        int k=0;
       for( int i=j; i<n;i++)
       {
            arr2[k] = arr[i];
            k++;
       }
        return fun(arr2,k);     //c.
    }

    int fun(int arr[] , int n)
    {
        for( int i =0; i<n; i++)
        {
            // if(arr[i]==0) continue;

            int abs = (int)Math.abs(arr[i]);
            if( abs-1 <n && arr[abs-1] >0)
            {
                arr[abs-1] = -arr[abs-1];
            }
        }
        for( int i =0; i<n ;i++)
        {
            if(arr[i]>0)
            return i+1;
        }
        return n+1;
    }
}
