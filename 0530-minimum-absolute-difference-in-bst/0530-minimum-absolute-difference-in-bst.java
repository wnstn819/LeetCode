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
        int result =Integer.MAX_VALUE;
        int prevVal = -1;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root,"root");
        return result;
    }

    public void inOrder(TreeNode node,String str){
        if(node == null){
            return;
        }
        System.out.println(str + " : node.val : " + node.val);
        inOrder(node.left,"left");

        if(prevVal == -1){
            
        }else{
            System.out.println("nodde : " + node.val);
            System.out.println("prevval : " + prevVal);
             System.out.println("result : " + result);
            result = Math.min(result, Math.abs(node.val - prevVal));
            System.out.println("result : " + result);
        }
        System.out.println("prevVal 초기화 : " + node.val);
        prevVal = node.val;

        inOrder(node.right, "right");

    }

    
}