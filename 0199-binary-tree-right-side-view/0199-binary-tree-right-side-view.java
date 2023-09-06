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
    List<Integer> list = new ArrayList<>();
    Map<Integer,Integer> map = new HashMap<>();
    public List<Integer> rightSideView(TreeNode root) {

        inorder(root,1);
        for(int a : map.keySet()){
            list.add(map.get(a));
        }
        return list;
    }

    public void inorder(TreeNode node,int depth){
        if(node == null){
            return;
        }

        inorder(node.left,depth +1);
        map.put(depth,node.val);
        inorder(node.right,depth +1);
    }
}