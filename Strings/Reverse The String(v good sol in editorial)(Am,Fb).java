// my solvepublic class Solution {
    public String solve(String S) {
      S=S.trim();
      S=S.replaceAll("( )+", " ");
        int n =S.length();
        char str[] = S.toCharArray();
        revWords(str, n);


        String res = String.valueOf(str);
        return res;
    }
    void revWords(char str[] ,int n )
    {
        int i=0;
        for(int j=0; j<n; j++)
        {
            if(str[j]==' ')
            {
                revChar(str,i,j-1);
                i=j+1;

            }
        }
        revChar(str,i,n-1);
        revChar(str,0,n-1);
    }

    void revChar(char str[], int low, int high)
    {
        while(low<=high)
        {
            char t = str[low];
            str[low] =str[high];
            str[high] =t;

            low++;
            high--;
        }
    }
}



editorial - fabulous Solution
public class Solution {
    public String solve(String A) {
        int i=0,j;
        int n=A.length();
        String res="";
        while(i<n){
            while(i<n&&A.charAt(i)==' '){
                i++;
            }
            if(i>=n){
                break;
            }
            j=i+1;
            while(j<n && A.charAt(j)!=' '){
                j++;
            }
            String w=A.substring(i,j);
            if(res.length()==0){
                res=w;
            }
            else{
                res=w+" "+res;
            }
            i=j+1;
        }
        return res;
    }
}
