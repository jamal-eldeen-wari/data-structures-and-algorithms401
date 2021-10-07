package Stack;

public class StackNode {
    private String data;
    private StackNode next;

    public StackNode() {
    }

    public StackNode(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public StackNode getNext() {
        return next;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "StackNode{" +
                "data='" + data + '\'' +
                ", next=" + next +
                '}';
    }
}
