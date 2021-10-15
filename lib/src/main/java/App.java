import BST.BinarySearch;
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
import Stack.StackNodeGeneric;
import Stack.StackGeneric;

public class App <T>{
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
//        Shelter shelter = new Shelter();
//
//        shelter.enqueueShelter(new Cat("cat"));
//        shelter.enqueueShelter(new Cat("cat"));
//        shelter.enqueueShelter(new Dog("dog"));
//
//        System.out.println(shelter.dequeueShelter("cat"));
//        System.out.println(shelter.dequeueShelter("dog"));


//        System.out.println(paranthisis("{}("));
//        String [] elements = {"Jamal","Khair", "Qusai", "Hi"};
//        System.out.println(duckDuckGoose(elements,1));
//
//    }
//
//    public static boolean paranthisis(String str){
//        if (str.isEmpty()){
//            return true;
//        }
//        StackGeneric stackNode = new StackGeneric();
//        for (int i = 0; i<str.length();i++){
//            char current = str.charAt(i);
//            if (current == '(' || current == '{' || current =='['){
//                stackNode.pushGeneric(current);
//            }
//            if (current == ')' || current == '}' || current ==']'){
//                if (stackNode.isEmpty()){
//                    return false;
//                }
//                char lastElement = (char) stackNode.peekGeneric();
//                if (current == '}' && lastElement == '{' || current == ')' && lastElement == '(' || current == ']' && lastElement == '['){
//                    stackNode.popGeneric();
//                }else{
//                    return false;
//                }
//
//            }
//        }
//        return stackNode.isEmpty();
//    }
//
//    public static String duckDuckGoose(String [] letters, int n ){
//        QueueGeneric queueGeneric = new QueueGeneric();
//
//        String dif = "";
//        int size = 0;
//
//        if (letters.length==0){
//            return "Array Empty";
//        }else{
//            for (int i = 0; i<letters.length; i++){
//                queueGeneric.enqueueGeneric(letters[i]);
//                size++;
//
//            }
//        }
//        while (size != 1){
//            for (int k = 0; k<n-1; k++){
//                dif= (String) queueGeneric.dequeueGeneric();
//                queueGeneric.enqueueGeneric(dif);
//            }
//            size--;
//        }
//        return (String) queueGeneric.dequeueGeneric();
//    }
        BinarySearch<Integer> binarySearch = new BinarySearch<>();
        binarySearch.insert(24);
        binarySearch.insert(35);
        binarySearch.insert(5);
        binarySearch.insert(6);
        binarySearch.insert(48);
        binarySearch.insert(9);


//        System.out.println(binarySearch);
        System.out.println(binarySearch.contains(24));
        System.out.println(binarySearch.contains(35));
        System.out.println(binarySearch.contains(5));
        System.out.println(binarySearch.contains(6));
        System.out.println(binarySearch.contains(48));
        System.out.println(binarySearch.contains(9));
    }
}

