package LinkedList;

public class LinkedList {
// this is only used for reference on the actual nodes (It is not a node)
    private LinkedListNode head;


    public void insertNode(String data){
        if (head == null){
            LinkedListNode linkedListNode = new LinkedListNode(data);
            head = linkedListNode;
        }else{
//            Current here is only a reference for the node
            LinkedListNode current;
            current = head;
//            This loop will check if the there is any next nodes or not
            while(current.getNext()!= null){
                current = current.getNext();
            }
//            Here we will create new node and set the current to the next element.
            LinkedListNode linkedListNode = new LinkedListNode(data);
            current.setNext(linkedListNode);


        }
    }

    public boolean includes(String data) throws Exception {
        LinkedListNode current = head;

        while (current != null){
            if (current.getData().equals(data)){
                return true;
            }else{
                current = current.getNext();
            }
        }
        return false;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            LinkedListNode current;
            current = head;

            System.out.print("HEAD -> ");

            while (current != null) {
                // moves the current reference along the list
                System.out.print(current + " -> ");
                current = current.getNext();
            }

            System.out.println("NULL");
        }
    }


}
