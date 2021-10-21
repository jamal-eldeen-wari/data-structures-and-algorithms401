package BST;

public class BinaryTree<T> {
    public BinarySearchNode<T> root;

    public BinaryTree() { root = null; }

    public void printLevelOrder() {
        int hieght = height(root);
        int i;
        for (i = 1; i <= hieght; i++)
            printCurrentLevel(root, i);
    }

    public int height(BinarySearchNode root){
        if (root == null)
            return 0;
        else {
            /* compute  height of each subtree */
            int lHeight = height(root.getLeftNode());
            int rHeight = height(root.getRightNode());

            /* use the larger one */
            if (lHeight > rHeight)
                return (lHeight + 1);
            else
                return (rHeight + 1);
        }
    }

    public void printCurrentLevel(BinarySearchNode root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.getData() + " ");
        else if (level > 1) {
            printCurrentLevel(root.getLeftNode(), level - 1);
            printCurrentLevel(root.getRightNode(), level - 1);
        }
    }

    }


