package BST;

import java.util.ArrayList;
import java.util.List;

public class KaryTreeNode <T>{
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

     public List<KaryTreeNode<T>> nodes = new ArrayList<>();

    public KaryTreeNode(T data) {
        this.data = data;
    }

    public List<KaryTreeNode<T>> getNodes() {
        return nodes;
    }

    public void setNodes(List<KaryTreeNode<T>> nodes) {
        this.nodes = nodes;
    }
    public void addNode(KaryTreeNode<T> node){
        this.nodes.add(node);
    }
}
