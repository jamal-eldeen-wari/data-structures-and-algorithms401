package LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList linkedList = new LinkedList();
        linkedList.insertNode("Jamal");
        linkedList.insertNode("Qusai");
        linkedList.insertNode("Khair");

        linkedList.printList();
//        linkedList.removeNode("Qusai");
//        System.out.println(" After Deletion");
//        linkedList.printList();

//
        System.out.println("InsertBefore method");
        linkedList.insertAfter("Qusai", "Khair");
        linkedList.insertBefore("Jamal", "Obada");
        linkedList.printList();

        System.out.println(linkedList.includes("Jamal"));



    }
}
