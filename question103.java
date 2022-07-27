class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        boolean zigzag = false;
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();

            for(int i=0; i<size; i++){
                TreeNode current = q.poll();

                if(zigzag){
                    temp.add(0, current.val);
                }
                else{
                    temp.add(current.val);
                }

                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }

            res.add(temp);
            zigzag = !zigzag;
        }

        return res;
    }
}
