// given array S = {-1 2 1 -4},
// and target = 1.
// The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)

// idea: form all possible triplet in N^3
//       given to do in N^2.
TC,SC :n^2,1
public class Solution {
    public int threeSumClosest(int[] A, int B) {

        // idea: sort , fix first ele, second as i +1 and thrid at last; if sum> target h-- else l++; lets code
        Arrays.sort(A);
        int n  = A.length;
        int closest = Integer.MAX_VALUE;
        int temp =0 ;
        for(int i=0 ; i<n-2;i++)
        {
            int sec = i+1;
            int thr = n-1;
            while(sec < thr)  // need to find all poss triplet for a part i.
            {
               int sum = A[i] + A[sec] +  A[thr];
                if(Math.abs(sum-B) ==0) return B; // closest sum ever ie. equal to B
                if(Math.abs(sum-B) < closest)  // we want sum closest to target. so best way is to check whose differnce is lesser.
                {
                    closest=Math.abs(sum-B);
                    temp=sum;
                }

                // two ptr
                if(sum > B)  // need to decrease sum - >lower down the high ptr
                thr--;

                else
                sec++;
            }
        }
        return temp;
    }
}
