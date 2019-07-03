package easy.trees.isSameTree_recursion;

public class NodeTree {

    private NodeTree left;
    private NodeTree right;
    private int val;
    public NodeTree(int val) {
        this.val = val;
    }

    public static boolean isSameTree(NodeTree one, NodeTree two) {
        if (one == null && two == null) {
            return true;
        }
        if (one == null || two == null || one.val != two.val) {
            return false;
        }
        return isSameTree(one.left, two.left) && isSameTree(one.right, two.right);
    }

    public NodeTree getLeft() {
        return left;
    }

    public void setLeft(NodeTree left) {
        this.left = left;
    }

    public NodeTree getRight() {
        return right;
    }

    public void setRight(NodeTree right) {
        this.right = right;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
