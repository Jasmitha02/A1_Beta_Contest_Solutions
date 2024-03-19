class MyQueue {
    private Stack<Integer> pushStack, popAndPeek;
    public MyQueue() {
        pushStack = new Stack<>();
        popAndPeek = new Stack<>();
    }
    public void push(int x) {
        pushStack.push(x);
    }
    private void check(Stack<Integer>pushStack, Stack<Integer>popAndPeek){
        if(popAndPeek.isEmpty()){
            while(!pushStack.isEmpty()){
                popAndPeek.push(pushStack.peek());
                pushStack.pop();
            }
        }
    }
    public int pop() {
        check(pushStack, popAndPeek);
        return popAndPeek.pop();
    }
    
    public int peek() {
        check(pushStack, popAndPeek);
        return popAndPeek.peek();
    }
    
    public boolean empty() {
        return pushStack.isEmpty() && popAndPeek.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */