
// O(logA),O(1)
import java.util.*;
public class Solution {
    public int isPower(int A) {
        // if(Math.sqrt(A)==A)
        // return 1;

        if(A==1)
        return 1;

        for( int i=2;i*i<=A;i++)
        {
            double ans =Math.log(A) / Math.log(i);
            if(ans- (int)(ans) <= 0.0000001)
              return 1;
        }

    return 0;
    }
}
