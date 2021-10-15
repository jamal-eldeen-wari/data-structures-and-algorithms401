/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LinkedList;

import BST.BinarySearch;
import BST.BinarySearchNode;
import Queue.Queue;
import Stack.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Queue.PsudoQueue;
import Queue.Shelter;
import Queue.Cat;
import Queue.Dog;


class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library linkedList = new Library();
        assertTrue(linkedList.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test void insertNodeTest() throws Exception {
        LinkedList linkedList = new LinkedList();

        linkedList.insertNode("Jamal");
        linkedList.insertNode("Qusai");
        linkedList.insertNode("Khair");

        assertTrue(linkedList.includes("Jamal"),"It must return true since Jamal is in the List");
        assertTrue(linkedList.includes("Qusai"),"It must return true since Qusai is in the List");
        assertTrue(linkedList.includes("Khair"),"It must return true since Khair is in the List");
    }

    @Test void printTest(){
        LinkedList linkedList = new LinkedList();
        linkedList.insertNode("Cobra Kai");
        linkedList.insertNode("Breaking Bad");

        assertEquals("HEAD -> { a } -> { b } -> { c } -> NULL",linkedList.toString());
    }

    @Test void insertBeforeTest(){
        LinkedList linkedList = new LinkedList();
        linkedList.insertNode("Cobra Kai");
        linkedList.insertNode("Breaking Bad");
        linkedList.insertNode("Prison Break");

        linkedList.insertBefore("Breaking Bad", "Rocky");

        assertEquals("{Cobra Kai} -> {Rocky} -> {Breaking Bad} -> {Prison Break}", linkedList.toString());
    }

    @Test void insertAfterTest(){
        LinkedList linkedList = new LinkedList();
        linkedList.insertNode("Cobra Kai");
        linkedList.insertNode("Breaking Bad");
        linkedList.insertNode("Prison Break");

        linkedList.insertAfter("Breaking Bad", "Rocky");
        assertEquals("{Cobra Kai} -> {Breaking Bad} -> {Rocky} -> {Prison Break}", linkedList.toString());
    }

    @Test void testKTH(){
        LinkedList linkedList = new LinkedList();
        linkedList.insertNode("Cobra Kai");
        linkedList.insertNode("Breaking Bad");
        linkedList.insertNode("Prison Break");
        linkedList.insertNode("Rambo");
        linkedList.insertNode("The Grudge");
        linkedList.insertNode("Mr. Nice Guy");

        linkedList.kth(3);
        assertEquals("Prison Break", linkedList.kth(3));


    }
    @Test void testMerge(){
        LinkedList linkedList = new LinkedList();
        linkedList.insertNode("Cobra Kai");
        linkedList.insertNode("Breaking Bad");
        linkedList.insertNode("Prison Break");
        linkedList.insertNode("Rambo");
        linkedList.insertNode("The Grudge");
        linkedList.insertNode("Mr. Nice Guy");

        LinkedList linkedList1 = new LinkedList();
        linkedList1.insertNode("Cobra Kai 2");
        linkedList1.insertNode("Breaking Bad 4");
        linkedList1.insertNode("Prison Break 4");
        linkedList1.insertNode("Rambo 2");
        linkedList1.insertNode("The Grudge 3");
        linkedList1.insertNode("Mr. Nice Guy 0");

        LinkedList linkedList2 = new LinkedList();
        String combinedList = linkedList2.mergeLists(linkedList1,linkedList);

        assertEquals(combinedList,linkedList2.mergeLists(linkedList1,linkedList));
    }

    @Test void testPush(){
        Stack stack = new Stack();
        stack.push("Jeff");
        assertFalse(stack.isEmpty());
    }

    @Test void testmultiplePushes(){
        Stack stack = new Stack();
        stack.push("J");
        stack.push("M");
        stack.push("Q");
        stack.push("K");
        stack.push("H");
        assertEquals("Stack{top=StackNode{data='H', next=StackNode{data='K', next=StackNode{data='Q', next=StackNode{data='M', next=StackNode{data='J', next=null}}}}}}",stack);
    }

    @Test void testPopStack(){
        Stack stack = new Stack();
        stack.push("J");
        stack.push("M");
        stack.push("Q");
        stack.push("K");
        stack.push("H");
        String popedValue = stack.pop();
        assertEquals(popedValue,stack.pop());
    }

    @Test void testMultiplePops(){
        Stack stack = new Stack();
        stack.push("J");
        stack.push("M");
        stack.push("Q");
        stack.push("K");
        stack.push("H");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
    }
    @Test void testPeek(){
        Stack stack = new Stack();
        stack.push("J");
        stack.push("M");
        stack.push("Q");
        stack.push("K");
        stack.push("H");
        stack.pop();
        String data = stack.peek();
        assertEquals(data,stack.peek());
    }

    @Test void testInstatiateStack(){
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test void testEmptyStackError(){
        Stack stack = new Stack();
        assertEquals("Stack empty", stack.peek());
        assertEquals("Stack empty",stack.pop());
    }

    @Test void testEnqueue(){
        Queue queue = new Queue();
        queue.enqueue("J");
        queue.enqueue("M");
        queue.enqueue("Q");
        queue.enqueue("K");
        queue.enqueue("H");
        assertFalse(queue.isEmpty());

    }

    @Test void testMulitipleEnquque(){
        Queue queue = new Queue();
        queue.enqueue("J");
        queue.enqueue("M");
        queue.enqueue("Q");
        queue.enqueue("K");
        queue.enqueue("H");
        assertEquals("Queue{front=QueueNode{data='J'}, rear=QueueNode{data='H'}}",queue);
    }
    @Test void TestDequue(){
        Queue queue = new Queue();
        queue.enqueue("J");
        queue.enqueue("M");
        queue.enqueue("Q");
        queue.enqueue("K");
        queue.enqueue("H");
        Object data = queue.dequeue();
        assertEquals(data,queue.dequeue());
    }

    @Test void testPeekQ(){
        Queue queue = new Queue();
        queue.enqueue("J");
        queue.enqueue("M");
        queue.enqueue("Q");
        queue.enqueue("K");
        queue.enqueue("H");
        String peek = queue.peek();
        assertEquals(peek,queue.peek());
    }

    @Test void emptyQueue(){
        Queue queue = new Queue();
        queue.enqueue("J");
        queue.enqueue("M");
        queue.enqueue("Q");
        queue.enqueue("K");
        queue.enqueue("H");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test void instatiateQueue(){
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
    }
    @Test void queueException(){
        Queue queue = new Queue();
        assertEquals("Queue is empty", queue.dequeue());
        assertEquals("Queue is empty", queue.peek());
    }

    @Test void TwoStacksTest(){
        PsudoQueue psudoQueue = new PsudoQueue();
        psudoQueue.enqueue("J");
        psudoQueue.enqueue("K");
        psudoQueue.enqueue("W");

        String deQueueRes = psudoQueue.deQueue();

        assertEquals(deQueueRes,psudoQueue.deQueue());
    }

    @Test void TestShelter(){
        Shelter shelter = new Shelter();

        shelter.enqueueShelter(new Cat("cat"));
        shelter.enqueueShelter(new Dog("dog"));

        assertEquals("cat", shelter.dequeueShelter("cat").toString());
        assertEquals("dog",shelter.dequeueShelter("dog").toString());
    }

//                                      Tree
    @Test void emptyTree(){
        BinarySearch<Integer> binarySearch = new BinarySearch<>();
        boolean emptyTree = binarySearch.isEmpty();
        assertEquals(emptyTree,binarySearch.isEmpty());
    }
    @Test void rootTree(){
        BinarySearch<String> binarySearch = new BinarySearch<>();
        binarySearch.insert("Jamal");
        boolean contain = binarySearch.contains("Jamal");
        assertEquals(contain, binarySearch.contains("Jamal"));
    }

    @Test void leftNodeInTree(){
        BinarySearch<Integer> binarySearch = new BinarySearch<>();
        binarySearch.insert(23);
        binarySearch.insert(3);
        assertEquals(true,binarySearch.contains(3));

    }

    @Test void rightNodeInTree(){
        BinarySearch<Integer> binarySearch = new BinarySearch<>();
        binarySearch.insert(23);
        binarySearch.insert(50);
        assertEquals(true,binarySearch.contains(50));
    }






}
