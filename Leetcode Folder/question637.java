class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> pq = new LinkedList<>();
        List<Double> res = new ArrayList<Double>();

        if(root==null){return res;}

        pq.add(root);
        while(!pq.isEmpty()){
            int level = pq.size();
            double avg = 0.0;

            for(int i=0; i<level; i++){
                TreeNode current = pq.poll();
                avg+=current.val;

                if(current.left!=null) pq.offer(current.left);
                if(current.right!=null) pq.offer(current.right);
            }

            res.add(avg/level);
        }
        return res;
    }
}
