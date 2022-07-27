class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root==null){ return result; }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int level = q.size();


            for(int i=0; i<level; i++){
                TreeNode current = q.remove();
                if(i==level-1) result.add(current.val);
                if(current.left!=null) q.offer(current.left);
                if(current.right!=null) q.offer(current.right);

            }
        }

        return result;
    }
}
