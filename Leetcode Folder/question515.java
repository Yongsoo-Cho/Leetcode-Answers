class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> pq = new LinkedList<TreeNode>();

        if(root==null){
            return res;
        }

        pq.add(root);
        while(!pq.isEmpty()){
            int level = pq.size();
            int max = Integer.MIN_VALUE;

            for(int i=0; i<level; i++){
                TreeNode current = pq.poll();
                if(current.val>max){
                    max = current.val;
                }
                if(current.left!=null){
                    pq.offer(current.left);
                }
                if(current.right!=null){
                    pq.offer(current.right);
                }
            }
             res.add(max);


        }
        return res;
    }
}
