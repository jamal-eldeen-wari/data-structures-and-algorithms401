package BST;

public class BinaryTreeNodeNotGeneric {
    private BinaryTreeNodeNotGeneric left;
    private BinaryTreeNodeNotGeneric right;
    private int data;

    public BinaryTreeNodeNotGeneric(int data) {
        this.data = data;
    }

    public BinaryTreeNodeNotGeneric getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNodeNotGeneric left) {
        this.left = left;
    }

    public BinaryTreeNodeNotGeneric getRight() {
        return right;
    }

    public void setRight(BinaryTreeNodeNotGeneric right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}