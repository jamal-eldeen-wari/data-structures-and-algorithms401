package BST;

import Queue.QueueGeneric;

import java.util.LinkedList;
import java.util.Queue;

public class KaryTree <T>{
    private KaryTreeNode<T> root;

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public KaryTreeNode<T> getRoot() {
        return root;
    }

    public void setRoot(KaryTreeNode<T> root) {
        this.root = root;
    }

    int k;

    public KaryTree(int value){
        if (value<=1){
            value = 2;
        }
        this.k = value;

    }
    public void add(T data){
        KaryTreeNode<T> node = new KaryTreeNode<>(data);

        if (this.root == null){
            this.root = node;
            return;
        }
//        QueueGeneric<KaryTreeNode<T>> queueGeneric = new QueueGeneric<KaryTreeNode<T>>();
//        queueGeneric.enqueueGeneric(root);
//        while (!queueGeneric.isEmpty()){
//            KaryTreeNode<T> currentNode = queueGeneric.dequeueGeneric();
//            if (currentNode.nodes.size()<this.k){
//                currentNode.addNode(node);
//                return;
//            }else{
//                queueGeneric.enqueueGeneric(currentNode);
//            }
//        }
        Queue<KaryTreeNode<T>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            KaryTreeNode<T> currentNode = queue.poll();
            if (currentNode.nodes.size()<this.k){
                currentNode.addNode(node);
                return;
            }else{
                queue.addAll(currentNode.nodes);
            }
        }

    }


}
