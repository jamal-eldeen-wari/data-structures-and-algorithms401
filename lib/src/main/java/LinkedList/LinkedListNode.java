package LinkedList;

public class LinkedListNode {
    private String data;
    private LinkedListNode next;

//                                      Constructor
    public LinkedListNode(String data) {
        this.data = data;
    }

//                                   Setters and Getters
    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

//                                        toString
    @Override
    public String toString() {
        return "{"+ data +"}" ;
    }
}
