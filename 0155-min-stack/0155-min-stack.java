class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min;
    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(min.isEmpty() || min.peek() >= val){
            min.push(val);
        }
        
    }
    
    public void pop() {
        System.out.println("stack.pop : " + stack.peek());
        System.out.println(min.peek());
        if(stack.pop().equals(min.peek())){
            System.out.println("here");
            min.pop();
        }
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        // System.out.println(min.toString());
        // System.out.println(min.peek());
        return min.peek();
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