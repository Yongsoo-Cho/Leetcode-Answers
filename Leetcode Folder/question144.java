
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        return dfs(root, list);
    }

    public List<Integer> dfs(TreeNode root, List<Integer> list){
        if(root==null){ return list; }

        list.add(root.val);
        dfs(root.left, list);
        dfs(root.right, list);
        return list;

    }
}
