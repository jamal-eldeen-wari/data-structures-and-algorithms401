package BST;

public class BinaryTreeNotGeneric {

    private BinaryTreeNodeNotGeneric root;

    public BinaryTreeNotGeneric() {
        root = null;
    }

    public BinaryTreeNodeNotGeneric getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNodeNotGeneric root) {
        this.root = root;
    }

    public int getLeafCount()
    {
        return getLeafCount(root);
    }

   public  int getLeafCount(BinaryTreeNodeNotGeneric node)
    {
        if (node == null)
            return 0;
        if (node.getLeft() == null && node.getRight() == null)
            return 1;
        else
            return getLeafCount(node.getLeft()) + getLeafCount(node.getRight());
    }
}
