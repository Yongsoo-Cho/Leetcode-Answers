class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int[] res = {0};
        int[] count= {0};

        order(root, k, res, count);

        return res[0];

    }
    public void order(TreeNode root, int k, int[] res, int[] count){
        if(root==null || count[0]==k) return;

        order(root.left, k, res, count);

        count[0]++;
        if(count[0]==k) res[0]=root.val;

        order(root.right, k, res, count);
    }
}
