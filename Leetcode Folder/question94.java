class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        return dfs(root, res);
    }
    public List<Integer> dfs(TreeNode root, List<Integer> res){
        if(root==null) { return res; }

        if(root.left!=null) { dfs(root.left, res); }
        res.add(root.val);
        if(root.right!=null) { dfs(root.right, res); }
        return res;
    }
}
