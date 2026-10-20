class MinStack {
    //[4,5,8,1]
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
       if (minStack.isEmpty() || val <= minStack.peek()) {
    minStack.push(val);
    } else {
        minStack.push(minStack.peek()); 
    }
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
