import java.util.ArrayList;

/*
 * Author:qinsky31;
 * 
 * UseTo:LeetCode
 * 
 * Function:112_Path_Sum
 * 
 * Date:2015年1月14日 下午2:12:58
 */


public class Solution {
    public static boolean hasPathSum(TreeNode root, int sum) {
    	boolean result = false;
    	ArrayList<TreeNode> node = new ArrayList();
    	ArrayList<Integer> total = new ArrayList();
    	int point = 0;
    	if (root==null){ 
    		return false;
    	}
    	node.add(root);
    	total.add(root.val);
    	
    	while (point<node.size()){
    		if (node.get(point).left!=null){
    			int tmp = total.get(point)+node.get(point).left.val;
    			node.add(node.get(point).left);
    			total.add(tmp);
    		}
    		if (node.get(point).right!=null){
    			int tmp = total.get(point)+node.get(point).right.val;
    			node.add(node.get(point).right);
    			total.add(tmp);
    		}
    		
    		if (node.get(point).left==null && node.get(point).right==null){
    			if (total.get(point)==sum){
    				return true;
    			}
    		}
    		point++;
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
		
		System.out.println(hasPathSum(null,17));
	}
}
