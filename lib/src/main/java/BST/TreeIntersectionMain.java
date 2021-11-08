package BST;

import Hash.HashTable;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersectionMain {
    public Integer[] intersection(BinaryTree<Integer> tree1, BinaryTree<Integer> tree2){

        HashTable<Integer , Integer> hashTable = new HashTable<>();
        List<Integer> similarity = new ArrayList<>();
        for(int i : tree1.inOrder(tree1.root) ) {
            hashTable.add(i , 0);
        }
        List<Integer> list = tree2.inOrder(tree2.root);
        for(int x : list){
            if(hashTable.containsHash(x)) {
                similarity.add(list.get(list.indexOf(x)));
            }
            else {
                hashTable.add(list.get(list.indexOf(x)) , 0);
            }
        }
        return similarity.toArray( new Integer[0]);

    }
}
