/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Double> list = new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {

        Deque<TreeNode> deque = new ArrayDeque<>();    
        deque.add(root);

        while(!deque.isEmpty()){
            int sz = deque.size();
            double val = 0;
            for(int i =0;i<sz;i++){
                TreeNode tn = deque.poll();
                val += tn.val;
                if(tn.left != null) deque.add(tn.left);
                if(tn.right != null) deque.add(tn.right);
            }
            list.add(val/sz);
            
        }
        return list;
    }


}