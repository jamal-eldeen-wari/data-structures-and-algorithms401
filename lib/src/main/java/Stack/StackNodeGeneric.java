package Stack;

public class StackNodeGeneric <T>{
    private T data;
    private StackNodeGeneric<T> next;

    public StackNodeGeneric(T data) {
        this.data = data;
    }

    public StackNodeGeneric() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public StackNodeGeneric<T> getNext() {
        return next;
    }

    public void setNext(StackNodeGeneric<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "StackNodeGeneric{" +
                "data=" + data +
                '}';
    }
}
