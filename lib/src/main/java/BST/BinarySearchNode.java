package BST;

public class BinarySearchNode <T>{

    private BinarySearchNode<T> leftNode;
    private BinarySearchNode<T> rightNode;
    private T data;

    public BinarySearchNode(T data) {
        this.data = data;
    }

    public BinarySearchNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinarySearchNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public BinarySearchNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinarySearchNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return (String) data;
    }
}
