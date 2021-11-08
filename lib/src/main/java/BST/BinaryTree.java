package BST;

import java.util.ArrayList;
import java.util.List;

//public class BinaryTree<T> {
//    public BinarySearchNode<T> root;
//
//    public BinaryTree() { root = null; }
//
//    public void printLevelOrder() {
//        int hieght = height(root);
//        int i;
//        for (i = 1; i <= hieght; i++)
//            printCurrentLevel(root, i);
//    }
//
//    public int height(BinarySearchNode root){
//        if (root == null)
//            return 0;
//        else {
//            /* compute  height of each subtree */
//            int lHeight = height(root.getLeftNode());
//            int rHeight = height(root.getRightNode());
//
//            /* use the larger one */
//            if (lHeight > rHeight)
//                return (lHeight + 1);
//            else
//                return (rHeight + 1);
//        }
//    }
//
//    public void printCurrentLevel(BinarySearchNode root, int level) {
//        if (root == null)
//            return;
//        if (level == 1)
//            System.out.print(root.getData() + " ");
//        else if (level > 1) {
//            printCurrentLevel(root.getLeftNode(), level - 1);
//            printCurrentLevel(root.getRightNode(), level - 1);
//        }
//    }
//
//}
public class BinaryTree<T> {
    public Node<Integer> root;
    List<T> data;

    public BinaryTree() {
        this.root = null;
        this.data = new ArrayList<>();
    }
    public List<T> inOrder(Node<T> node) {
        if (node != null) {
            inOrder(node.left);
            data.add(node.data);
            inOrder(node.right);
        }
        return data;
    }
}