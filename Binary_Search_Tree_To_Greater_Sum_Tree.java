package AllCodes;

public class Binary_Search_Tree_To_Greater_Sum_Tree {

	 public TreeNode bstToGst(TreeNode root) {
	        replace(root,0);
	        return root;
	    }
	     public int replace(TreeNode root,int currSum) {
			if(root==null){
	            return currSum;
	        }
	        int rightSum=replace(root.right,currSum);
	        
	        rightSum+=root.val;
	        root.val=rightSum;
	        
	        int leftSum=replace(root.left,rightSum);
	        
	        return leftSum;
		}
}
