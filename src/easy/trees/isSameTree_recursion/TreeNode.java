package easy.trees.isSameTree_recursion;

public class TreeNode {

    private TreeNode left;
    private TreeNode right;
    private int val;
    public TreeNode(int val) {
        this.val = val;
    }

    public static boolean isSameTree(TreeNode one, TreeNode two) {
        if (one == null && two == null) {
            return true;
        }
        if (one == null || two == null || one.val != two.val) {
            return false;
        }
        return isSameTree(one.left, two.left) && isSameTree(one.right, two.right);
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
