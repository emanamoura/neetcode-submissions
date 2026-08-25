class MinStack {
    private List<Integer> minStack;
    private Deque<Integer> stack;

    public MinStack() {
        minStack = new ArrayList<>();
        stack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        minStack.add(val);

        if (stack.isEmpty()) {
            stack.push(val);
        } else {
            stack.push(Math.min(val, stack.peek()));
        }
    }
    
    public void pop() {
        minStack.remove(minStack.size() - 1);
        stack.pop();
    }
    
    public int top() {
        return minStack.get(minStack.size() - 1);
    }
    
    public int getMin() {
        return stack.peek();
    }
}