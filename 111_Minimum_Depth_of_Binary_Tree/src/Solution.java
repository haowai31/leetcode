import java.util.Stack;

/**
 * Created by qinsky31 on 15-1-16.
 */
public class Solution {
    public static int minDepth(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> depth = new Stack<Integer>();
        int result = Integer.MAX_VALUE;
        stack.push(root);
        depth.push(1);
        if (root==null){
            return 0;
        }
        while(!stack.empty()){
            TreeNode node = stack.pop();
            int dep = depth.pop();
            if (node.right!=null){
                stack.push(node.right);
                depth.push(dep+1);
            }
            if (node.left!=null) {
                stack.push(node.left);
                depth.push(dep+1);
            }
            if (node.left==null && node.right==null) {
                if (result > dep) {
                    result = dep;
                }
            }
        }



        return result;
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

        System.out.println(minDepth(null));
    }
}
