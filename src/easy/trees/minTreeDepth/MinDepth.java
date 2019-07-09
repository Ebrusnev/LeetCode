package easy.trees.minTreeDepth;

import easy.trees.isSameTree_recursion.TreeNode;

public class MinDepth {

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = 1;
        if (root.getRight() != null && root.getLeft() == null) {
            return count + minDepth(root.getRight());
        }
        if (root.getRight() == null && root.getLeft() != null) {
            return count + minDepth(root.getLeft());
        }

        return count + Math.min(minDepth(root.getLeft()), minDepth(root.getRight()));
    }

}
