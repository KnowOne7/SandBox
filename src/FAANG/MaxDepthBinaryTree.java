package FAANG;

public class MaxDepthBinaryTree {
        // postOrder Depth First Search
    // Recursion call for Depth
        public int maxDepth(TreeNode root) {
            if(root == null)
                return 0;

            int left = maxDepth(root.left);
            int right = maxDepth(root.right);

            return Math.max(left, right) + 1;

        }


}

