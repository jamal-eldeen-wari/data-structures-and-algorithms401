package Stack;

public class StackGeneric <T> {
    private StackNodeGeneric<T> top;


    public void pushGeneric(T data){
        if (isEmpty()){
            StackNodeGeneric stackNode = new StackNodeGeneric(data);
            top = stackNode;
        }else{
            StackNodeGeneric stackNode = new StackNodeGeneric(data);
            stackNode.setNext(top);
            top = stackNode;
        }
    }

    public T popGeneric(){
        if (isEmpty()){
            return (T) "The stack is empty";
        }else{
            T data = top.getData();
            top = top.getNext();
            return data;
        }

    }

    public T peekGeneric(){
        if (isEmpty()){
            return (T) "Stack empty";
        }else{
            return top.getData();
        }

    }


    public boolean isEmpty(){
        return top==null;
    }



}
