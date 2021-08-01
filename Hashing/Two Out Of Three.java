public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Set<Integer> set1 = new HashSet<>();
         Set<Integer> set2 = new HashSet<>();
          Set<Integer> set3 = new HashSet<>();
           Set<Integer> ans_set = new HashSet<>();
        for( int i=0; i<A.size(); i++)
        {
            set1.add(A.get(i));
        }

        for( int i=0; i<B.size(); i++)
        {
            set2.add(B.get(i));

        }
        for( int i=0; i<C.size(); i++)
        {
            set3.add(C.get(i));
        }
        for( int i :set1)
        {
            if(set2.contains(i) || set3.contains(i))
            ans_set.add(i);
        }
        for( int i :set2)
        {
            if(set1.contains(i) || set3.contains(i))
            ans_set.add(i);
        }
        for( int x :ans_set)
        al.add(x);

    Collections.sort(al);



        return al;
    }
}
