package Hash;

import java.util.ArrayList;
import java.util.Objects;

public class HashTable <K, V>{
    private ArrayList<HashNode<K, V>> bucketArray;
    private int numOfBuckets;
    private int size;

    public HashTable() {
        bucketArray = new ArrayList<>();
        numOfBuckets = 10;
        size = 0;

        // create bucket array AKA simulate an actual array
        for (int i = 0; i < numOfBuckets; i++) {
//            Adding null to our list;
            bucketArray.add(null);
        }
    }

    private int hashCode(K key) {
        return Objects.hashCode(key);
    }
    public int getBucketIndex(K key) {
//        Calling the hashcode method from line 23.
        int hashCode = hashCode(key);


        int index = hashCode % numOfBuckets;
//        If the index is negative make it positive;
        index = index < 0 ? index * -1 : index;

        return index;
    }
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public void add(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<>(key, value, hashCode);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);

        if ((1.0 * size) / numOfBuckets >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            numOfBuckets = 2 * numOfBuckets;
            size = 0;

            for (int index = 0; index < numOfBuckets; index++) {
                bucketArray.add(null);
            }


            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // search the linked list
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                return head.value;
            }

            head = head.next;
        }

        return null;
    }


    public boolean containsHash(K key){
        if (key == null){
           return false;
        }else {
            return get(key)!=null;
        }
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "bucketArray=" + bucketArray +
                ", numOfBuckets=" + numOfBuckets +
                ", size=" + size +
                '}';
    }
}
