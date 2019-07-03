package easy.trees.maxTreeDepth;

import easy.trees.isSameTree_recursion.NodeTree;

public class MaxDepth {

    public static int maxDepth(NodeTree root) {
        int count = 1;
        if (root == null) {
            return 0;
        }
        count += Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
        return count;
    }

}
