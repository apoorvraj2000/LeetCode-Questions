package AllCodes;

public class Range_Sum_of_BST {

	 public int rangeSumBST(TreeNode root, int low, int high) {
	        
	       return helper(root,low,high,0);
	    }
	    public int helper(TreeNode root, int low, int high, int sum){
	        if(root == null){ return sum; }        
			if(root.val >= low && root.val <= high){
				sum += root.val;
			}
	        if(low < root.val){
	            sum = helper(root.left, low, high, sum);
	            }
			if(high >= root.val){ 
	            sum = helper(root.right, low, high, sum);                      
			}         
	        return sum;
	    }
}
