package AllCodes;

public class Validate_Binary_Search_Tree_Optimize {

	 public boolean isValidBST(TreeNode root) {
	        if(root==null)
	            return true;
	       
	        return result(root,Long.MIN_VALUE,Long.MAX_VALUE);
	        
	    }
	    public boolean result(TreeNode root, long min, long max) {

			if(root==null)
	            return true;
	       
	        if(root.val<=min || root.val>=max){
	            return false;
	        }
	      
	     
	         boolean ans1=result(root.left,min,root.val);
	         boolean ans2=result(root.right,root.val,max);
	        
	        if(ans1==true && ans2==true)
	            return true;
	        
	        return false;
	        
		}
}
