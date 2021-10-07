package Stack;

public class Stack {

private StackNode top;

public void push(String data){
    if (isEmpty()){
        StackNode stackNode = new StackNode(data);
        top = stackNode;
    }else{
        StackNode stackNode = new StackNode(data);
        stackNode.setNext(top);
        top = stackNode;
    }

}
public String pop(){
    if (isEmpty()){
        return "The stack is empty";
    }else{
        String data = top.getData();
        top = top.getNext();
        return data;
    }

}
public String peek(){
    if (isEmpty()){
        return "Stack empty";
    }else{
        return top.getData();
    }

}
public boolean isEmpty(){
    return top==null;
}

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }
}
