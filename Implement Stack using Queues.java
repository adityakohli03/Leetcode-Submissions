class MyStack {
    Queue<Integer> q = new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        Queue<Integer> newq = new LinkedList<Integer>();
        newq.add(x);
        while (q.size() > 0) {
            newq.add(q.poll());
        }
        q = newq;
    }
 
    // Removes the element on top of the stack.
    public int pop() {
      return  q.poll();
    }
 
    // Get the top element.
    public int top() {
        return q.peek();
    }
 
    // Return whether the stack is empty.
    public boolean empty() {
        return q.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */