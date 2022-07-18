class MyQueue {
    Stack<Integer> temp = new Stack<>();
    Stack<Integer> main = new Stack<>();

    public MyQueue() {

    }
    //first in first out
    public void push(int x) {
        //first we reverse the order of the stack so the return order is like a queue
        while(!main.isEmpty()){
            temp.push(main.pop());
        }

        main.push(x);

        while(!temp.isEmpty()){
            main.push(temp.pop());
        }


    }

    public int pop() {
        return main.pop();
    }

    public int peek() {
        return main.peek();
    }

    public boolean empty() {
        return main.isEmpty();
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
