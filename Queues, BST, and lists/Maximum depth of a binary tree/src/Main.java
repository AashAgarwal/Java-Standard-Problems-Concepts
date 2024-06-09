    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int currentDepth = 0;
            if (node.right != null) {
                stack.push(node.right);
                currentDepth++;
            }
            if (node.left != null) {
                stack.push(node.left);
                currentDepth++;
            }
            currentDepth++;
            depth = Math.max(depth, currentDepth);
        }
        return depth;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }