package AllCodes;

public class Maximum_Difference_Between_Node_and_Ancestor {
	 public int maxAncestorDiff(TreeNode root) {
	       if (root == null) {
	            return 0;
	        }
	        
	        return helper(root,root.val,root.val);
	    }
	    private int helper(TreeNode root, int max, int min){
	        if(root==null){
	             return max-min;
	        }
	           
	        
	        max=Math.max(max,root.val);
	        min=Math.min(min,root.val);
	        
	        int op1=helper(root.left,max,min);
	        int op2=helper(root.right,max,min);
	        
	        return Math.max(op1,op2);
	    }
}
