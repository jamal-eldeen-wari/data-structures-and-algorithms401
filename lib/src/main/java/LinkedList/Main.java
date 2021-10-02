package LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList linkedList = new LinkedList();
        linkedList.insertNode("Jamal");
        linkedList.insertNode("Qusai");

        linkedList.printList();
        linkedList.removeNode("Qusai");
        System.out.println(" After Deletion");
        linkedList.printList();



        System.out.println(linkedList.includes("Jamal"));


    }
}
