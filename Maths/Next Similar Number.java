public class Solution {
    public String solve(String A) {
        int n =A.length(); 
        if(n==1)  return "-1";

         int arr[] = new int[n];
         int i =0;
         for(  i =0; i<n;i++)
         {
             arr[i] = A.charAt(i) - '0';
         }
         // findind minInd
        for( i =n-1 ;i>0 ;i--)
        {
            if(arr[i] > arr[i-1])
            break;
        }
         
         if(i==0) //descenfin order
        return "-1";
        else
        {
            // int x =arr[i-1] , min =i;
            // for(int j =i+1; j<n; j++)
            // {
            //     if(arr[j]> x && arr[j] < arr[min])
            //     min=j;
            // }

            int com = arr[i-1]; int min = Integer.MAX_VALUE; int minIndex=-1;
            for(int j=i; j<n;j++)
            {
                if(com < arr[j]) 
                { 
                    if(min > arr[j])
                    { min=arr[j]; minIndex=j;}    
                }
            }
        int temp=arr[i-1];
         arr[i-1]=arr[minIndex];
         arr[minIndex] =temp;

        //  int temp=arr[i-1];
        //  arr[i-1]=arr[min];
        //  arr[min] =temp;

         // sort
         Arrays.sort(arr,i,n);
        }

        

    StringBuffer s = new StringBuffer();
        String str="";
        s.append(arr[0]);
        for( i =1;i <n ; i++)
        {
            s.append(str).append(arr[i]);
        }
 
       
        return  s.toString();
     
    }
}


Example Input
Input 1:

 A = "218765"
Input 2:

 A = "4321"


Example Output
Output 1:

 "251678"
Output 2:

 "-1"
