# Singly Linked List:

A data structure that contains nodes that links/points to the next node in the list. Is a sequence of Nodes that are connected/linked to each other.


## Challenge:
Well the challenge is to create three methods from scratch without using built in methods

## Approach & Efficiency:
The apporach i took today is iterative while building and the BigO notation is O(n) 

## API:
The three methods used are:
1. Insert: Allows the user to add nodes or data to their linkedlist 
2. Includes: Allows the user to check for specific element in the linked list.
3. toString: it allows the result to shown in cool way

## WhiteBoard For Linked List:

![Linked List](https://user-images.githubusercontent.com/83535791/135768836-21ac1d50-e770-48c2-81b6-391672803134.jpg)

## Approach & Efficiency:
Those three methods that are added thier time complexity is O(n) and space as well 

## WhiteBoard For Linked List For Kth :

![KTH element](https://user-images.githubusercontent.com/83535791/135899021-0329fbb3-84ec-4e26-ba02-9779e75a7c6a.png)

## Challenge: 
We need a method that can traverse a linked list from the end to find specific element.

## Approach & Efficiency:
The apporach i took today is iterative while building and the BigO notation is O(n) 






## API:
Kth: It is used to traverse the linkedlist from the end.


## WhiteBoard For Linked List For Merge Lists :
![Merged List](https://user-images.githubusercontent.com/83535791/136077063-7f30cb70-24cc-4437-9c59-0fdaf5cddd7d.png)

## Challenge: 
We need a method that can merge two linked list to one large linked list

## Approach & Efficiency:
The apporach i took today is iterative while building and the BigO notation is O(n) 

## API:
mergeList: It is used to merge two list as an input and return a new list with the values combined.


# Stacks and Queue:
Are linear data structures Stack is a container of objects that are inserted and removed according to the last-in first-out (LIFO) principle. Queue is a container of objects (a linear collection) that are inserted and removed according to the first-in first-out (FIFO) principle.

## Challenge: 
Is to develop the stacks and queues from scratch.

## Approach & Efficiency:
The apporach i took today is iterative while building and the BigO notation is O(1) 

## API:
### Stack:
1. Push: Nodes or items that are put into the stack are pushed.
2. Pop - Nodes or items that are removed from the stack are popped.
3. Top - This is the top of the stack.
4. Peek - When you peek you will view the value of the top Node in the stack.
5. IsEmpty - returns true when stack is empty otherwise returns false.
###Queue
1. Enqueue - Nodes or items that are added to the queue.
2. Dequeue - Nodes or items that are removed from the queue. If called when the queue is empty an exception will be raised.
3. Front - This is the front/first Node of the queue.
4. Rear - This is the rear/last Node of the queue.
5. Peek - When you peek you will view the value of the front Node in the queue. If called when the queue is empty an exception will be raised.
6. IsEmpty - returns true when queue is empty otherwise returns false.


# Psudo Queue:
We need a way to traverse the queue by using two stacks. A queue can be implemented using two stacks. Let queue to be implemented be q and stacks used to implement q be stack1 and stack2. q can be implemented in two ways: 
1.  This method makes sure that oldest entered element is always at the top of stack 1, so that deQueue operation just pops from stack1. To put the element at top of stack1, stack2 is used.
2.  in en-queue operation, the new element is entered at the top of stack1. In de-queue operation, if stack2 is empty then all the elements are moved to stack2 and finally top of stack2 is returned. 

## Whiteboard for psudo queue:
![Two Stacks](https://user-images.githubusercontent.com/83535791/136709996-8c460fe5-4b79-463c-9286-18bc2443a3fb.png)


## Challenge:
We need a way to traverse the queue by using two stacks.

## Approach & Efficiency:
The apporach i took today is iterative while building and the BigO notation is O(n) For the enqueue because of the while loop and dequeue will be O(1).

## API:
enqueue: It adds a node to the Stack and makes the process similar to the Queue enqueue method but with worst time complexity.
dequeue: it removes a node from the stack in similar approach to dequeue in queues.

# Queue Animal Shelter:

## Whiteboard:
![animalShelter](https://user-images.githubusercontent.com/83535791/136859974-75ffe31f-4878-495f-9615-0a54e7349f9c.png)

## Challenge: 
We need a way to store animal data in the queue and remove it from it using FIFO 

## API:
enqueue: It adds a Animal to the queue.
dequeue: it removes a Animal from the Queue.

## Stack and Queue Brackets:

## Whiteboard:
![bracket](https://user-images.githubusercontent.com/83535791/137030282-bb8a6aca-ac06-4b2e-a83e-e3a6feb3cd81.png)

## Challenge:
We need to make a method that deals with brackets and check if each bracket has its openening and closing.

## API:
Method called Pranthisis that takes a String and returns a boolean value 


## Binary Search Tree:

## Challenge:
Is to create Two methods One for inserting a node to the tree and the other is to to check if the node is in the tree (Contains).

## Approach and Effeciency:
For both methods i used the recursive as my approach and the BigO notation is:
1. Insert: Time complexity O(n) and Space Complexity is O(1).
2. Contains: Time Complexity O(log n) and Space Complexity is O(1).

## API:
1. Insert Method: Has a helper method that has all the code in it 
2. Contains method: Also has a helper method that has all the code in it

## Binary Search Tree Find Maximum:
![MaxValue IN a tree](https://user-images.githubusercontent.com/83535791/137639328-78cd085b-905e-4bed-a21e-0134391f049f.png)

## Challenge:
Is to find the maximum number in the binary search tree.

## Approach and Effecincey:
The apprach that i used today is recursive to solve this code challenge. For the BigO notation:
1. Time complexity is O(n).
2. Space complexity O(1).

## API:
One method is responsible for searching for the largest value in the tree.

## Binary Tree Traversal (Breadth):
![Binary Tree Traversal (Breadth)](https://user-images.githubusercontent.com/83535791/137800716-17ae1a47-e98b-44c1-8810-8909e0be71e4.png)

## Challenge:
We need to traverse a binary tree in the breadth where it will traverse from the root to the end of the tree.

## Approach and Effecincey:
The approach that i used today is a mixture of both (recursive and iterative) where the:
1. Time Complexity: is O(n^2) in worst case.
2. Space Complexity: is O(n) is worst case.

## API:
Well, for this challenge it required three methods to solve it.

## Fizz Buzz K-ary Tree:


![FizzBuzz](https://user-images.githubusercontent.com/83535791/138319579-e3aaec56-31ae-4b58-be1c-08aad5c7b4a0.png)

## Challenge
Determine whether or not the value of each node is divisible by 3, 5 or both. Create a new tree with the same structure as the original, but the values modified as follows:

+ If the value is divisible by 3, replace the value with “Fizz”
+ If the value is divisible by 5, replace the value with “Buzz”
+ If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
+ If the value is not divisible by 3 or 5, simply turn the number into a String.

## Approach & Efficiency
+ Write a fizzBuzzTree funtion 
+ Then we need to traverse the whole tree and convert each node value to either "Fizz", "Buzz", "FizzBuzz", or a String, depending on if it's divisible by 3, 5, 3 and 5, or neither.

Big O:
Time: O(N)
Space: O(N)

## Insertion Sort:

![Insertion Sort](https://user-images.githubusercontent.com/83535791/139598778-9243fcab-f776-40dd-b7ca-34de6effb73b.png)

## Challenge:
We need a method that will sort the array elements in increasing order.

## Approach & Efficiency:
Time Complexity: O(n^2) Auxiliary Space: O(1)

## Merge Sort:
## Challenge:
We need a method that will sort the array elements in increasing order using merge sort which is known as divide and conquer.
![MergeSort](https://user-images.githubusercontent.com/83535791/139690796-00de53d0-0ad8-4c15-9960-169f9c4e9ef4.png)

## Approach and Effeciancy:
Time complexity is O(n) in worst case because it a recursive algorithm
Space Complexity is O(n) because of the Divide and Conquer.



