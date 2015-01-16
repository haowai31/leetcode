/**
 * Created by qinsky31 on 15-1-16.
 */
public class Solution {
    public static boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        int depthOfLeft = getDepth(root.left, 1);
        int depthOfRight = getDepth(root.right, 1);

        if(Math.abs(depthOfRight-depthOfLeft) > 1){
            return false;
        }else{
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    private static int getDepth(TreeNode tree, int currentDepth){
        if(tree == null){
            return currentDepth;
        }
        return Math.max(getDepth(tree.left, currentDepth+1),
                getDepth(tree.right, currentDepth+1));
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(5);
        TreeNode a2 = new TreeNode(4);
        TreeNode a3 = new TreeNode(8);
        TreeNode a4 = new TreeNode(11);
        TreeNode a5 = new TreeNode(13);
        TreeNode a6 = new TreeNode(4);
        TreeNode a7 = new TreeNode(7);
        TreeNode a8 = new TreeNode(2);
        TreeNode a9 = new TreeNode(1);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a3.left = a5;
        a3.right = a6;
        a4.left = a7;
        a4.right = a8;
        a6.right = a9;

        System.out.println(isBalanced(a1));
    }
}
