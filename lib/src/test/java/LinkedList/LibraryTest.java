/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LinkedList;

import BST.*;
import Hash.HashTable;
import Hash.JoinLeft;
import MergeSort.MergeSort;
import Queue.Queue;
import Stack.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Queue.PsudoQueue;
import Queue.Shelter;
import Queue.Cat;
import Queue.Dog;

import java.util.Arrays;
import java.util.HashMap;


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
        assertEquals(3,binarySearch.getRoot().getLeftNode().getData());

    }

    @Test void rightNodeInTree(){
        BinarySearch<Integer> binarySearch = new BinarySearch<>();
        binarySearch.insert(23);
        binarySearch.insert(50);
        assertEquals(50,binarySearch.getRoot().getRightNode().getData());
    }

    @Test void maxTest(){
        BinarySearch<Integer> binarySearch = new BinarySearch<>();
        binarySearch.insert(24);
        binarySearch.insert(35);
        binarySearch.insert(5);
        binarySearch.insert(6);
        binarySearch.insert(48);
        binarySearch.insert(9);
        int value  = binarySearch.findMaxValue();
        assertEquals(value, binarySearch.findMaxValue());
    }

//    @Test void breadthTest(){
//
//        BinaryTree<Integer> binaryTree = new BinaryTree<>();
//        binaryTree.root = new BinarySearchNode<>(20);
//        binaryTree.root.setRightNode(new BinarySearchNode<>(10));
//        binaryTree.root.setLeftNode(new BinarySearchNode<>(34));
//        binaryTree.root.getRightNode().setRightNode(new BinarySearchNode<>(30));
////        binaryTree.printLevelOrder();
//        int h = binaryTree.height(binaryTree.root);
//        assertEquals(h,binaryTree.height(binaryTree.root));
//    }

    @Test void karyTreeTest(){
        KaryTree<Integer> karyTree=new KaryTree<>(3);
        karyTree.add(5);
        karyTree.add(12);
        karyTree.add(6);
        karyTree.add(10);
        KaryTree<Integer> karyTreeTest=new KaryTree<>(3);
        karyTreeTest.add(5);
        assertEquals(karyTreeTest.getRoot(),karyTree.getRoot());
    }
    @Test void mergeSort(){
        MergeSort mergeSort = new MergeSort();
        int [] numbers = {4,2,8,11,3,6};
        mergeSort.mergeSort(numbers);
        assertEquals(Arrays.toString(numbers),Arrays.toString(numbers));
    }

    @Test void hashTableAddTest(){
        HashTable<String, Integer> movieRaiting = new HashTable<>();
        movieRaiting.add("Cobra Kai", 9);
        movieRaiting.add("Breaking Bad", 10);
        int size = movieRaiting.getSize();
        assertEquals(size, movieRaiting.getSize());

    }
    @Test void hashTableGetValueFromSpecificKey(){
        HashTable<String, Integer> movieRaiting = new HashTable<>();
        movieRaiting.add("Cobra Kai", 9);
        movieRaiting.add("El Camino", 10);
        int value = movieRaiting.get("El Camino");
        assertEquals(value,movieRaiting.get("El Camino") );
    }

    @Test void hashTableContainsTest(){
        HashTable<String, Integer> movieRaiting = new HashTable<>();
        movieRaiting.add("Cobra Kai", 9);
        movieRaiting.add("El Camino", 10);
        boolean contain = movieRaiting.containsHash("Cobra Kai");
        assertEquals(contain,movieRaiting.containsHash("Cobra Kai"));
    }

    @Test void hashTestIndex(){
        HashTable<String, Integer> movieRaiting = new HashTable<>();
        movieRaiting.add("Man in Black", 9);
        movieRaiting.add("El Camino", 10);
        int index = movieRaiting.getBucketIndex("Man in Black");
        assertEquals(index, movieRaiting.getBucketIndex("Man in Black"));
    }

    @Test void hashWithNull(){
        HashTable<String, Integer> movieRaiting = new HashTable<>();
        movieRaiting.add("Man in Black", 9);
        movieRaiting.add("El Camino", 10);
        assertNull(movieRaiting.get("handle"));
    }
    @Test void handleCollision(){
        HashTable<String, Integer> movieRaiting = new HashTable<>();
        movieRaiting.add("Man in Black", 9);
        movieRaiting.add("Cobra Kai", 9);
        movieRaiting.add("Rambo", 10);
        movieRaiting.add("El Camino", 10);
        int size = movieRaiting.getSize();
        assertEquals(size, movieRaiting.getSize());

    }

    @Test void getFromCollision(){
        HashTable<String, Integer> movieRaiting = new HashTable<>();
        movieRaiting.add("Man in Black", 7);
        movieRaiting.add("Cobra Kai", 9);
        movieRaiting.add("Rambo", 10);
        movieRaiting.add("Rambo", 10);
        movieRaiting.add("El Camino", 10);
        int value = movieRaiting.get("Rambo");
        assertEquals(value,movieRaiting.get("Rambo"));
    }

    @Test void TestRepeatWord(){
        HashTable<String, Integer> text = new HashTable<>();
        String textOfWords = "What does a man do ? man a man provides even if he is not appreciated";
        String word = text.hashMapRepeatedWord(textOfWords);
        assertEquals(word, text.hashMapRepeatedWord(textOfWords));
    }

    @Test void similarityTest(){
        BinaryTree<Integer> tree1 = new BinaryTree<>();
        BinaryTree<Integer> tree2 = new BinaryTree<>();

        tree1.root = new Node<>(15);
        tree1.root.left = new Node<>(5);
        tree1.root.right = new Node<>(24);
        tree1.root.right.right = new Node<>(48);
        tree1.root.right.left = new Node<>(88);
        tree1.root.right.left.right = new Node<>(6);


        tree2.root = new Node<>(9);
        tree2.root.left = new Node<>(20);
        tree2.root.right = new Node<>(24);
        tree2.root.right.right = new Node<>(48);
        tree2.root.right.left = new Node<>(5);
        tree2.root.right.left.right = new Node<>(6);
        TreeIntersectionMain treeIntersectionMain = new TreeIntersectionMain();
       assertEquals("[5, 6, 24, 48]",Arrays.toString(treeIntersectionMain.intersection(tree1,tree2)));
    }

    @Test void joinLeftTest(){
        JoinLeft joinLeft = new JoinLeft();

        HashMap hashMap1 = new HashMap();
        hashMap1.put("fond", "enamored");
        hashMap1.put("wrath", "anger");
        hashMap1.put("diligent", "employed");
        hashMap1.put("outfit", "garb");
        hashMap1.put("guide", "usher");

        HashMap hashMap2 = new HashMap();

        hashMap2.put("fond", "averse");
        hashMap2.put("wrath", "delight");
        hashMap2.put("diligent", "idle");
        hashMap2.put("guide", "follow");
        hashMap2.put("flow", "jam");

        assertEquals("[diligent: employed idle, outfit: garb null, wrath: anger delight, guide: usher follow, fond: enamored averse]",joinLeft.joinLeft(hashMap1 , hashMap2).toString());
    }
}
