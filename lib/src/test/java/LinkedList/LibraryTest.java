/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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


}
