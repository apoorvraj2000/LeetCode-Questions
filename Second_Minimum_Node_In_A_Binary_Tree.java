package AllCodes;

public class Second_Minimum_Node_In_A_Binary_Tree {

	 public int firstMin;
	    public int secondMin=Integer.MAX_VALUE;
	    public boolean otherValues=false;
	    public int findSecondMinimumValue(TreeNode root) {
	        
	        if(root.left==null && root.right==null)
	            return -1;
	        
	        firstMin=root.val;
	        
	        helper(root);
	        
	        if(!otherValues)
	            return -1;
	        
	        return secondMin;
	    }
	     public void helper(TreeNode root) {
	         if(root==null)
	             return;
	         
	         if(root.val!=firstMin){
	             secondMin=Math.min(root.val,secondMin);
	             otherValues=true;
	         }
	         
	         helper(root.left);
	         
	         helper(root.right);
	     }
}
