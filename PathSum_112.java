package easy;

import general.TreeNode;

public class PathSum_112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public boolean hasPathSum(TreeNode root, int sum) {
	        return helper(root,sum,0);
	    }
	    public boolean helper(TreeNode root, int sum, int curSum ){
	        if(root!=null)
	            curSum += root.val;
	        else
	            return false;
	        if(root.left== null && root.right == null){
	            if(curSum == sum)
	                return true;
	        }
	        return (helper(root.left, sum, curSum) || helper(root.right, sum, curSum));
	    }
}
