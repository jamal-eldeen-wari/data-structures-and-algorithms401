import LinkedList.LinkedList;
import Queue.Queue;
import Queue.QueueNode;
import Stack.Stack;
import Queue.PsudoQueue;
import Queue.Shelter;
import Queue.Cat;
import Queue.Dog;
import Queue.Animal;
import Queue.QueueGeneric;

public class App {
    public static void main(String[] args) {
////        LinkedList linkedList = new LinkedList();
////        linkedList.insertNode("Jamal");
////        linkedList.insertNode("Qusai");
////        linkedList.insertNode("Khair");
////        linkedList.insertNode("Mohammad");
////        linkedList.insertNode("Khalid");
////        linkedList.insertNode("Mark");
////        linkedList.insertNode("Jeff");
////
////        LinkedList linkedList1 = new LinkedList();
////        linkedList1.insertNode("John");
////        linkedList1.insertNode("Omar");
////        linkedList1.insertNode("Dani");
////        linkedList1.insertNode("Marcos");
////        linkedList1.insertNode("Sara");
////        linkedList1.insertNode("Nour");
////        linkedList1.insertNode("Jimmie");
////
////        linkedList.printList();
////        linkedList1.printList();
////
////        LinkedList linkedList3 = new LinkedList();
////        System.out.println(linkedList3.mergeLists(linkedList,linkedList1));
//
////        System.out.println(" After Deletion");
////        linkedList.printList();
////        linkedList.kth(2);
////        System.out.println(linkedList.kth(2));
//
////
////        System.out.println("InsertBefore method");
////        linkedList.insertAfter("Qusai", "Khair");
////        linkedList.insertBefore("Jamal", "Obada");
////        linkedList.printList();
//
////        System.out.println(linkedList.includes("Jamal"));
//
////        Stack stack = new Stack();
////        stack.push("J");
////        stack.push("M");
////        stack.push("Q");
////        stack.push("K");
////        stack.push("H");
////
////        System.out.println(stack);
////
////        System.out.println(stack.pop());
////        System.out.println(stack.peek());
////
////        Queue queue = new Queue();
////        queue.enqueue("Cobra Kai");
////        queue.enqueue("Prison Break");
////        queue.enqueue("Breaking Bad");
////        queue.enqueue("Rambo");
////        queue.enqueue("Rocky");
////        System.out.println(queue);
////        System.out.println(queue.peek());
////        System.out.println(queue.dequeue());
//
////        PsudoQueue psudoQueue = new PsudoQueue();
////        psudoQueue.enqueue("J");
////        psudoQueue.enqueue("A");
////        psudoQueue.enqueue("M");
////        psudoQueue.enqueue("A");
////        psudoQueue.enqueue("L");
////        psudoQueue.enqueue("W");
////        psudoQueue.enqueue("A");
////        psudoQueue.enqueue("R");
////        psudoQueue.enqueue("I");
////
////        System.out.println(psudoQueue.deQueue());
////        System.out.println(psudoQueue.deQueue());
////        System.out.println(psudoQueue.deQueue());
////        System.out.println(psudoQueue.deQueue());
////        System.out.println(psudoQueue.deQueue());
////        System.out.println(psudoQueue.deQueue());
//
//        QueueGeneric queueGeneric = new QueueGeneric();
//
        Shelter shelter = new Shelter();

        shelter.enqueueShelter(new Cat("cat"));
        shelter.enqueueShelter(new Cat("cat"));
        shelter.enqueueShelter(new Dog("dog"));

        System.out.println(shelter.dequeueShelter("cat"));
        System.out.println(shelter.dequeueShelter("dog"));

    }
}

