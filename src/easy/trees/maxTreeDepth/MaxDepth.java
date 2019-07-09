package easy.trees.maxTreeDepth;

import easy.trees.isSameTree_recursion.TreeNode;

public class MaxDepth {

    public static int maxDepth(TreeNode root) {
        int count = 1;
        if (root == null) {
            return 0;
        }
        count += Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
        return count;
    }

}
