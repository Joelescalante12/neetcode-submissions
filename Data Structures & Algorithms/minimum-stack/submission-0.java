class MinStack {
    //[4,5,8,1]
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(minStack.isEmpty()){
            minStack.push(val);
        }else{
            int smallest = val;
            for(int nu : minStack){
                if(nu < smallest){
                    smallest = nu;
                }
            }
            minStack.push(smallest);
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
