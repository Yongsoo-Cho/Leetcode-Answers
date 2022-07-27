class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if(root==null) return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> val = new ArrayList<>();

            for(int i=0; i<level; i++){
                TreeNode current = queue.poll();
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
                val.add(current.val);
            }
            res.add(0, val);
        }
        return res;

    }
}
