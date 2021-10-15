package BST;

public class BinarySearch <T extends Comparable<T>>{
    private BinarySearchNode<T> root;

    public BinarySearchNode<T> getRoot() {
        return root;
    }

    public void setRoot(BinarySearchNode<T> root) {
        this.root = root;
    }

    public void insert(T data){
        if (isEmpty()){
            BinarySearchNode<T> binarySearchNode = new BinarySearchNode<>(data);
            root = binarySearchNode;
        }else{

            insertHelper(data,root);
        }

    }

    private void insertHelper(T data, BinarySearchNode<T> root){
        BinarySearchNode<T> binarySearchNode = new BinarySearchNode<>(data);

        if (data.compareTo(root.getData())<0){
            if (root.getLeftNode() == null){
                root.setLeftNode(binarySearchNode);
            }else {
                insertHelper(data,root.getLeftNode());
            }


        }else if (data.compareTo(root.getData())>0){
            if (root.getRightNode() == null){
                root.setRightNode(binarySearchNode);
            }else {
                insertHelper(data,root.getRightNode());
            }
        }
    }


public boolean contains( T x ) {
    return contains( x, root );
}
    private boolean contains( T x, BinarySearchNode<T> node ) {
        if( node == null )
            return false;
        int res = x.compareTo( node.getData() );
        if( res < 0 )
            return contains( x, node.getLeftNode() );
        else if( res > 0 )
            return contains( x, node.getRightNode());
        else
            return true; // Match The node we are searching for
    }

    public boolean isEmpty(){
        return root == null;
    }



}
