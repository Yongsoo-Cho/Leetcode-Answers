class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> pq = new LinkedList<TreeNode>();

        if(root == null){
            return res;
        }
        pq.offer(root);

        while(!pq.isEmpty()){
            int level = pq.size();
            List<Integer> nodes = new LinkedList<Integer>();
            for(int i=0; i<level; i++){
                if(pq.peek().left != null){
                    pq.offer(pq.peek().left);
                }
                if(pq.peek().right != null){
                    pq.offer(pq.peek().right);
                }
                nodes.add(pq.poll().val);
            }
            res.add(nodes);
        }

        return res;
    }
}
