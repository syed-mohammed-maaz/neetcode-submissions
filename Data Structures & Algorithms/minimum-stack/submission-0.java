class MinStack {

    Deque<Integer> st;
    public MinStack() {
        st=new ArrayDeque();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return Collections.min(st);
    }
}
