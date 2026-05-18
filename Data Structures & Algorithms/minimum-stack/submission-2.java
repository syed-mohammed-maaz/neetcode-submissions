class MinStack {
    /**
    Brute force
    1.Use deque and inialialize to to use built in stack
    ->Deque<Integer> stack=new ArrayDeque<>();
    2.Use Collections.min(stack)//to find the min element
     */
    Deque<Integer> stack;
    Deque<Integer> minStack=new ArrayDeque<>();
    int minimum=Integer.MAX_VALUE;
    public MinStack() {
        stack=new ArrayDeque<>();
    }
    
    public void push(int val) {
        if(val<minimum) minimum=val;
        minStack.push(minimum);
        stack.push(val);

    }
    
    public void pop() {
      stack.pop();
        minStack.pop();
        if(minStack.size()>0)   minimum=minStack.peek();
        else minimum=Integer.MAX_VALUE;
        
      
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
         return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */