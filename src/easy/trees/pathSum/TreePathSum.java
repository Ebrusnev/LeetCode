package easy.trees.pathSum;

import easy.trees.isSameTree_recursion.TreeNode;

public class TreePathSum {

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        sum -= root.getVal();
        if (root.getRight() == null && root.getLeft() == null) {
            return 0 == sum;
        }
        return hasPathSum(root.getLeft(), sum) || hasPathSum(root.getRight(), sum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.setLeft(new TreeNode(4));
        root.setRight(new TreeNode(8));
        root.getLeft().setLeft(new TreeNode(11));
        root.getLeft().setRight(null);
        root.getRight().setLeft(new TreeNode(13));
        root.getRight().setRight(new TreeNode(4));
        root.getLeft().getLeft().setLeft(new TreeNode(7));
        root.getLeft().getLeft().setRight(new TreeNode(2));
        root.getRight().getRight().setRight(new TreeNode(1));

        System.out.println(hasPathSum(root, 18));
        System.out.println(hasPathSum(root, 1));
    }

}
