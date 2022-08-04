class Solution {
    public boolean isSymmetric(TreeNode root) {
        return dfs(root, root);
    }

    public boolean dfs(TreeNode root1, TreeNode root2) {
        if(root1==null || root2==null) return root1 == root2;

        return root1.val==root2.val && dfs(root1.left, root2.right) && dfs(root1.right, root2.left);
    }
}
