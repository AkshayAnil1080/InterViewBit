public class Solution {
    public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer> al = new ArrayList<>();
        int prev=1;
        al.add(prev);
       for(int i =1; i <=A;i++)
       {
           int curr=  (prev*(A-i+1))/i;
           al.add(curr);
           prev=curr;
       }
       return al;

    }


}
