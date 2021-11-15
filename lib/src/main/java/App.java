import BST.*;
import Graph.Graph;
import Hash.HashTable;
import Hash.JoinLeft;
import MergeSort.MergeSort;
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

import java.util.Arrays;
import java.util.HashMap;
import LinkedList.LinkedList;
import java.util.Queue;


public class App <T>{
    public static void main(String[] args) {
        System.out.println("Hello From Khair");
////        LinkedList linkedList = new LinkedList();
////        linkedList.insertNode("Jamal");
////        linkedList.insertNode("Qusai");
////        linkedList.insertNode("Khair");
////        linkedList.insertNode("Mohammad");
////        linkedList.insertNode("Khalid");
////        linkedList.insertNode("Mark");
////        linkedList.insertNode("Jeff");
////
//        LinkedList linkedList1 = new LinkedList();
//        linkedList1.insertNode("John");
//        linkedList1.insertNode("Omar");
//        linkedList1.insertNode("Dani");
//        linkedList1.insertNode("Marcos");
//        linkedList1.insertNode("Sara");
//        linkedList1.insertNode("Nour");
//        linkedList1.insertNode("Jimmie");
//
//        LinkedList linkedList = new LinkedList();
//        linkedList.in
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
////
//        PsudoQueue psudoQueue = new PsudoQueue();
//        psudoQueue.enqueue("J");
//        psudoQueue.enqueue("A");
//        psudoQueue.enqueue("M");
//        psudoQueue.enqueue("A");
//        psudoQueue.enqueue("L");
//        psudoQueue.enqueue("W");
//        psudoQueue.enqueue("A");
//        psudoQueue.enqueue("R");
//        psudoQueue.enqueue("I");
//////
//        System.out.println(psudoQueue.deQueue());
//        System.out.println(psudoQueue.deQueue());
//        System.out.println(psudoQueue.deQueue());
//        System.out.println(psudoQueue.deQueue());
//        System.out.println(psudoQueue.deQueue());
//        System.out.println(psudoQueue.deQueue());



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
//        BinarySearch<Integer> binarySearch = new BinarySearch<>();
//        binarySearch.insert(24);
//        binarySearch.insert(35);
//        binarySearch.insert(5);
//        binarySearch.insert(6);
//        binarySearch.insert(48);
//        binarySearch.insert(9);
//
//
////        System.out.println(binarySearch);
//        System.out.println(binarySearch.contains(24));
//        System.out.println(binarySearch.contains(35));
//        System.out.println(binarySearch.contains(5));
//        System.out.println(binarySearch.contains(6));
//        System.out.println(binarySearch.contains(48));
//        System.out.println(binarySearch.contains(9));
//
//        System.out.println(binarySearch.findMaxValue());


//        BinaryTree<Integer> binaryTree = new BinaryTree<>();
//        binaryTree.root = new BinarySearchNode<>(20);
//        binaryTree.root.setRightNode(new BinarySearchNode<>(10));
//        binaryTree.root.setLeftNode(new BinarySearchNode<>(34));
//        binaryTree.root.getRightNode().setRightNode(new BinarySearchNode<>(30));
//
//        BinaryTree<Integer> binaryTree2 = new BinaryTree<>();
//        binaryTree2.root = new BinarySearchNode<>(20);
//        binaryTree2.root.setRightNode(new BinarySearchNode<>(10));
//        binaryTree2.root.setLeftNode(new BinarySearchNode<>(34));
//        binaryTree2.root.getRightNode().setRightNode(new BinarySearchNode<>(30));
//        int res2 = ((BinaryTree<Integer>) binaryTree2).getLeafCount();
//
//        BinaryTree<Integer> tree1 = new BinaryTree<>();
//        BinaryTree<Integer> tree2 = new BinaryTree<>();
//
//        tree1.root = new Node<>(15);
//        tree1.root.left = new Node<>(5);
//        tree1.root.right = new Node<>(24);
//        tree1.root.right.right = new Node<>(48);
//        tree1.root.right.left = new Node<>(88);
//        tree1.root.right.left.right = new Node<>(6);
//
//
//        tree2.root = new Node<>(9);
//        tree2.root.left = new Node<>(20);
//        tree2.root.right = new Node<>(24);
//        tree2.root.right.right = new Node<>(48);
//        tree2.root.right.left = new Node<>(5);
//        tree2.root.right.left.right = new Node<>(6);
//
//        TreeIntersectionMain treeIntersectionMain = new TreeIntersectionMain();
//        System.out.println(Arrays.toString(treeIntersectionMain.intersection(tree1, tree2)));
//
//
//        int res = binaryTreeNotGeneric1.getLeafCount();
//
//        if (res1 == res){
//            System.out.println("Equal");
//        }else{
//            System.out.println("Not Equal");
//        }
//        KaryTree <Integer> karyTree=new KaryTree<>(1);
//        karyTree.add(3);
//        karyTree.add(6);
//        karyTree.add(11);
//        karyTree.add(10);
//        karyTree.add(90);
//        karyTree.add(77);
//        System.out.println(fizzBuzzTree(karyTree).getRoot().nodes.get(0).getData());


//        MergeSort mergeSort = new MergeSort();
//        int [] numbers = {8,4,23,42,16,15};
//        mergeSort.mergeSort(numbers);
//        for (int i = 0; i<numbers.length; i++){
//            System.out.println(Arrays.toString(numbers));
//        }

//        HashTable<String, Integer> movieRaiting = new HashTable<>();
//        studentAllowances.add("John", 300);
//        studentAllowances.add("Sally", 400);
//        studentAllowances.add("Tom", 200);
//        studentAllowances.add("Jade", 100);
//        studentAllowances.add("Doa", 600);
//        studentAllowances.add("Farah", 700);
//        studentAllowances.add("Jason", 90000);
//        studentAllowances.add("Morgan", 800);
//        studentAllowances.add("Naim", 1000);
//        studentAllowances.add("Qusai", 1500);
//        studentAllowances.add("Deyaa", 10000);
//
//        movieRaiting.add("Cobra Kai", 9);
//        movieRaiting.add("Breaking Bad", 10);
//        movieRaiting.add("Man in Black", 8);
//        movieRaiting.add("Rambo", 9);
//        movieRaiting.add("El Camino", 5);
//        movieRaiting.add("El ", 6);
//        movieRaiting.add(" Camino", 3);
//        movieRaiting.add("l Camino", 7);
//        movieRaiting.add("E Camino", 8);
//        movieRaiting.add("El Camin", 10);
//        movieRaiting.add("El Camno", 1);
//        System.out.println(movieRaiting);
//
//        System.out.println(movieRaiting.containsHash("Cobra Kai"));
//        System.out.println("get method "+ movieRaiting.get("Breaking Bad"));
//        System.out.println("getBucketIndex "+ movieRaiting.getBucketIndex("Rambo"));


//        HashTable<String, Integer> text = new HashTable<>();
//       String textOfWords = "What does a man do ? man a man provides even if he is not appreciated";
//        System.out.println(text.hashMapRepeatedWord(textOfWords));
//        JoinLeft joinLeft = new JoinLeft();
//
//        HashMap hashMap1 = new HashMap();
//        hashMap1.put("fond", "enamored");
//        hashMap1.put("wrath", "anger");
//        hashMap1.put("diligent", "employed");
//        hashMap1.put("outfit", "garb");
//        hashMap1.put("guide", "usher");
//
//        HashMap hashMap2 = new HashMap();
//
//        hashMap2.put("fond", "averse");
//        hashMap2.put("wrath", "delight");
//        hashMap2.put("diligent", "idle");
//        hashMap2.put("guide", "follow");
//        hashMap2.put("flow", "jam");

//
//        System.out.println(joinLeft.joinLeft(hashMap1 , hashMap2));
//
//        LinkedList linkedList   = new LinkedList();
//        linkedList.add(0,"j");
//        linkedList.add(1,"a");
//        System.out.println(linkedList);

//        String myStr = "What does a man do ? man a man provides even if he is not appreciated";
//        String[] str = myStr.split(" ");
//        Arrays.sort(str);
//        System.out.println(Arrays.toString(str));
//        int common = 0;
//        int counter= 1;
//        String word = str[0];
//        String current = str[0];
//        for(int i = 1; i<str.length; i++){
//            if(str[i].equals(current)){
//                counter++;
//            }
//            else{
//                counter =1;
//                current = str[i];
//            }
//            if(common<counter){
//                common = counter;
//                word = str[i];
//            }
//        }
//        System.out.println(common + " x " + word);

        Graph graph = new Graph();
        graph.addNode("Cobra Kai");
        graph.addNode("Breaking Bad");
        graph.addNode("Rambo");

        graph.addEdge("Cobra Kai", "Breaking Bad");
        graph.addEdge("Cobra Kai", "Rambo");
        graph.addEdge("Cobra Kai", "Cobra Kai");
        graph.addEdge("Breaking Bad", "Rambo");

//        System.out.println("Nodes are: "+graph.getNodes());
//        System.out.println("Neighbors are: "+graph.getNeighbors("Cobra Kai"));
//        System.out.println("Size "+ graph.size());
//        System.out.println("BFS Traversal Is "+ graph.breadthFirstSearch("Cobra Kai"));
        Graph CC37 = new Graph();

        CC37.addNode("Pandora");
        CC37.addNode("Arendelle");
        CC37.addNode("Metroville");
        CC37.addNode("Monstroplolis");
        CC37.addNode("Narnia");
        CC37.addNode("Naboo");

        CC37.edgeWeight("Pandora", "Arendelle", 150);
        CC37.edgeWeight("Arendelle", "Metroville",99);
        CC37.edgeWeight("Arendelle", "Monstroplolis",42);
        CC37.edgeWeight("Metroville", "Narnia",37);
        CC37.edgeWeight("Metroville", "Naboo",26);
        CC37.edgeWeight("Metroville", "Monstroplolis",105);
        CC37.edgeWeight("Monstroplolis", "Naboo",73);
        CC37.edgeWeight("Narnia", "Naboo",250);

        String cityNames [] = {"Pandora","Arendelle","Metroville"};

        System.out.println("Trip Cost Is: "+CC37.businessTrip(CC37,cityNames));



//
//        LinkedList linkedList = new LinkedList();
//        linkedList.insertNode("Khair");
//        linkedList.insertNode("Mohammad");
//        linkedList.insertNode("Heba");
//        linkedList.insertNode("Nawal");
//        linkedList.insertNode("Nawal");

//        System.out.println(linkedList.deleteDublicated(linkedList));



    }







//    public static KaryTree<String> fizzBuzzTree(KaryTree<Integer> node){
//        KaryTree<String> newTree = new KaryTree<>(node.getK());
//        Queue<KaryTreeNode<Integer>> newQueue = new LinkedList<>();
//        if(node.getRoot() != null){
//            newQueue.add(node.getRoot());
//            while(!newQueue.isEmpty()){
//                KaryTreeNode<Integer> current = newQueue.poll();
//                String currentValue;
//                if(current.getData() % 3 == 0 && current.getData() % 5 == 0)
//                    currentValue = "FizzBuzz";
//                else if(current.getData() % 3 == 0){
//                    currentValue="Fizz";
//                }
//                else if(current.getData() % 5 == 0){
//                    currentValue="Buzz";
//                }
//                else{
//                    currentValue=current.getData().toString();
//                }
//                newTree.add(currentValue);
//                if(! current.nodes.isEmpty()){
//                    newQueue.addAll(current.nodes);
//                }
//            }
//        }
//        return newTree;
//    }
}

