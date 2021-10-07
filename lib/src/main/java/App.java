import LinkedList.LinkedList;
import Queue.Queue;
import Queue.QueueNode;
import Stack.Stack;

public class App {
    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//        linkedList.insertNode("Jamal");
//        linkedList.insertNode("Qusai");
//        linkedList.insertNode("Khair");
//        linkedList.insertNode("Mohammad");
//        linkedList.insertNode("Khalid");
//        linkedList.insertNode("Mark");
//        linkedList.insertNode("Jeff");
//
//        LinkedList linkedList1 = new LinkedList();
//        linkedList1.insertNode("John");
//        linkedList1.insertNode("Omar");
//        linkedList1.insertNode("Dani");
//        linkedList1.insertNode("Marcos");
//        linkedList1.insertNode("Sara");
//        linkedList1.insertNode("Nour");
//        linkedList1.insertNode("Jimmie");
//
//        linkedList.printList();
//        linkedList1.printList();
//
//        LinkedList linkedList3 = new LinkedList();
//        System.out.println(linkedList3.mergeLists(linkedList,linkedList1));

//        System.out.println(" After Deletion");
//        linkedList.printList();
//        linkedList.kth(2);
//        System.out.println(linkedList.kth(2));

//
//        System.out.println("InsertBefore method");
//        linkedList.insertAfter("Qusai", "Khair");
//        linkedList.insertBefore("Jamal", "Obada");
//        linkedList.printList();

//        System.out.println(linkedList.includes("Jamal"));

        Stack stack = new Stack();
        stack.push("J");
        stack.push("M");
        stack.push("Q");
        stack.push("K");
        stack.push("H");

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.peek());

        Queue queue = new Queue();
        queue.enqueue("Cobra Kai");
        queue.enqueue("Prison Break");
        queue.enqueue("Breaking Bad");
        queue.enqueue("Rambo");
        queue.enqueue("Rocky");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());


    }
}
