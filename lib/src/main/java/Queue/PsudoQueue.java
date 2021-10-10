package Queue;

import Stack.Stack;

public class PsudoQueue  {

    private String data;
    public Stack stack1 = new Stack();
    public Stack stack2 = new Stack();

    public PsudoQueue(String data) {
        this.data = data;
    }

    public PsudoQueue() {
    }

    public void enqueue(String data){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(data);

        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
//        stack2.push(data);
    }

    public String deQueue(){
        if (stack1.isEmpty()){
           return "queue is Empty";
        }
        String element = stack1.peek();
        stack1.pop();
        return element;
    }
}
