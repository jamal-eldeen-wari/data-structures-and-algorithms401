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

    public boolean contains(T value){
      while (root != null){
          if (value.compareTo(root.getData())>0){
              root = root.getRightNode();
          }else if (value.compareTo(root.getData())<0){
              root = root.getLeftNode();
          }else {
              return true;
          }
      }
      return false;
    }

    public boolean isEmpty(){
        return root == null;
    }



}
