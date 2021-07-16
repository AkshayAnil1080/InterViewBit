class Solution {
   Stack<Integer> ms= new Stack<Integer>();
Stack<Integer> as = new Stack<>();

    public void push(int x) {

         ms.push(x);
          if(as.isEmpty() || as.peek()>= x)
          as.push(x);

    }

    public void pop() {
      if(!ms.isEmpty())
        { int n= ms.pop();
          if(n==as.peek())
          as.pop();
        }
    }

    public int top() {
      if(ms.isEmpty())
      return -1;

        return ms.peek();
    }

    public int getMin() {
        if(as.isEmpty())
      return -1;

        return as.peek();
    }
}
