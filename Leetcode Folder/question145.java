class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        return dfs(root, res);
    }

    public List<Integer> dfs(TreeNode root, List<Integer> res){
        if(root == null) { return res; }
        if( root.left !=null ) { dfs(root.left, res); }
        if( root.right !=null ) { dfs(root.right, res); }
        res.add(root.val);
        return res;
    }
}
