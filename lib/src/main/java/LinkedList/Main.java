package LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList linkedList = new LinkedList();
        linkedList.insertNode("Jamal");
        linkedList.insertNode("Qusai");
        linkedList.insertNode("Khair");
        linkedList.insertNode("Mohammad");
        linkedList.insertNode("Khalid");
        linkedList.insertNode("Mark");
        linkedList.insertNode("Jeff");

        linkedList.printList();
//        linkedList.removeNode("Qusai");
//        System.out.println(" After Deletion");
//        linkedList.printList();
//        linkedList.kth(2);
        System.out.println(linkedList.kth(2));

//
//        System.out.println("InsertBefore method");
//        linkedList.insertAfter("Qusai", "Khair");
//        linkedList.insertBefore("Jamal", "Obada");
//        linkedList.printList();

//        System.out.println(linkedList.includes("Jamal"));



    }
}
