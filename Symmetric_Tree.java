package AllCodes;

public class Symmetric_Tree {

	public boolean isSymmetric(TreeNode root) {
	       if(root==null)
	            return true;
	        
	        return helper(root.left,root.right);
	        
	    }
	    public boolean helper(TreeNode rootLeft,TreeNode rootRight) {
	        if(rootLeft==null && rootRight==null)
	            return true;
	        
	        if((rootLeft==null && rootRight!=null)||(rootLeft!=null && rootRight==null)){
	            return false;
	        }
	        if(rootLeft.val!=rootRight.val)
	                return false;
	        
	        
	        boolean ans1=helper(rootLeft.left,rootRight.right);
	        
	        boolean ans2=helper(rootLeft.right,rootRight.left);
	        
	        if(ans1==true && ans2==true)
	            return true;
	        
	        return false;  
	    }
}
