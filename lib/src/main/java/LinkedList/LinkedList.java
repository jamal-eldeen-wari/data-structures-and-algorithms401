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

            while (current != null) {
                // moves the current reference along the list
                System.out.print(current + " -> ");
                current = current.getNext();
            }

            System.out.println("NULL");
        }
    }

    public void removeNode(String data){
        LinkedListNode current;
        if (head == null){
            return;
        }else{

            current = head;
            while (current.getNext()!= null){
                if (current.getNext().getData().equals(data)){
                    current.setNext(current.getNext().getNext());
                    return;
                }
                current = current.getNext();
            }


        }


    }

    public void insertAfter(String data, String newData){
        LinkedListNode current = head;

        while (current.getNext()!=null){
            if (current.getNext().getData().equals(data)){
                LinkedListNode linkedListNode = new LinkedListNode(newData);
                linkedListNode.setNext(current.getNext());
                current.setNext(linkedListNode);

            }
            current= current.getNext();
        }

    }

    public void insertBefore(String data, String newData){
        LinkedListNode current = head;
        LinkedListNode previous = current;

        while (current!=null){
            if (current.getData().equals(data)){
                LinkedListNode lln = new LinkedListNode(newData);
                lln.setNext(current);
                previous.setNext(lln);
                break;

            }
            previous = current;
            current = current.getNext();

        }
    }

//    public LinkedListNode kth (int position){
//        LinkedListNode previous = head;
//        LinkedListNode current = head;
//
//        int count = 1;
//
//        while(count<= position-1){
//            current.setNext(current.getNext());
//            count++;
//        }
//        while(current.getData()!=null){
//            current.setNext(current.getNext());
//            previous.setNext(previous.getNext());
//        }
//        return previous;
//    }

    public String kth(int position){
        int count = 0;

        LinkedListNode current = head;

        while (current.getNext()!=null){
            current = current.getNext();
            count++;
        }
        if (count<position){
            return "Nothing found";
        }
        current = head;
        for (int i = 1; i<count-position+1; i++){
            current = current.getNext();
        }
//        System.out.println(current.getData());
        return current.getData();
    }



}
